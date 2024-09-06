const { app, BrowserWindow, ipcMain, Menu, Tray } = require('electron');
const macAddr = require('os').networkInterfaces()
const path = require('path');

let tray;
let mainWindow;

// 트레이
function initTrayIconMenu(){
  tray = new Tray('C:/Users/gukjang/GukJang/image/star.png'); 
  const myMenu = Menu.buildFromTemplate([
    {
      label: '맥 어드레스 내놔!', type: 'normal', checked: true,
      click: () => {
        getMacAddress();
      },
    },
  ])
  tray.setToolTip('Get Mac Address!')
  tray.setContextMenu(myMenu)
}

function getMacAddress(){
    // MAC 주소만 추출
  const ethernetMac = macAddr["이더넷"].map((item) => item.mac).filter((value, index, self) => self.indexOf(value) === index);
  mainWindow.webContents.send('tray-click', ethernetMac);
}

// 브라우저
function createWindow() {  
  mainWindow = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      preload: path.join(__dirname, 'preload.js'), // preload.js를 사용하여 보안성을 높임
      nodeIntegration: false,
      contextIsolation: true,
    },
  });

  mainWindow.loadFile('./html/index.html');

  mainWindow.on('closed', function () {
    mainWindow = null;
  });
}

app.on('ready', () => {
  createWindow();
  initTrayIconMenu();
});