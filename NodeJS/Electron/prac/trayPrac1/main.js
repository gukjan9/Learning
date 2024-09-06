const { app, BrowserWindow, ipcMain, Menu, Tray } = require('electron');
const path = require('path');

let tray;
let mainWindow;

//트레이 아이콘
function initTrayIconMenu(){
  tray = new Tray('C:/Users/gukjang/GukJang/image/star.png'); 
  const myMenu = Menu.buildFromTemplate([
    {
      label: '1번', type: 'normal', checked: true,
      click: () => {
        console.log('1번클릭!');
        mainWindow.webContents.send('tray-click', '1번 클릭!');
      },
    },
    {
      label: '2번', type: 'normal',
      click: () => {
        console.log('2번클릭!');
        mainWindow.webContents.send('tray-click', '2번 클릭!');
      },
    },
    {
      label: '3번', type: 'normal',
      click: () => {
        console.log('3번클릭!');
        mainWindow.webContents.send('tray-click', '3번 클릭!');
      },
    },
  ])
  tray.setToolTip('트레이 아이콘!')
  tray.setContextMenu(myMenu)
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