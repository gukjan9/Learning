const { app, BrowserWindow, ipcMain, Menu, Tray } = require('electron');
const macAddr = require('os').networkInterfaces()
const path = require('path');

let tray;
let mainWindow;

//트레이 아이콘
function initTrayIconMenu(){
  tray = new Tray('C:/Users/gukjang/GukJang/image/star.png'); 
  const myMenu = Menu.buildFromTemplate([
    {
      label: 'Get Mac Address!', type: 'normal', checked: true,
      click: () => {
        getMacAddress();
      },
    },
  ])
  tray.setToolTip('트레이 아이콘!')
  tray.setContextMenu(myMenu)
}

function getMacAddress(){
    Object.keys(macAddr).forEach((k) => {
        macAddr[k].forEach((v) => {
          console.log(v['mac']);
          mainWindow.webContents.send('tray-click', JSON.stringify(macAddr, null, 2));
        });
      });
}

// 브라우저 창을 생성하는 함수
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