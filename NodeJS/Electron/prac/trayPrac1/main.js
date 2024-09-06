const { app, BrowserWindow } = require('electron');
const {Menu, Tray} = require('electron');

let tray;
//트레이 아이콘
function initTrayIconMenu(){
  tray = new Tray('C:/Users/gukjang/GukJang/image/oasis-guitar.jpg'); 
  const myMenu = Menu.buildFromTemplate([
    {label: '1번', type: 'normal', checked: true, click: ()=>{console.log('1번클릭!')} },  //checked는 기본선택입니다.
    {label: '2번', type: 'normal', click: ()=>{console.log('2번클릭!')}},
    {label: '3번', type: 'normal', click: ()=>{console.log('3번클릭!')}}
  ])
  tray.setToolTip('트레이 아이콘!')
  tray.setContextMenu(myMenu)
}

// 브라우저 창을 생성하는 함수
function createWindow () {  
  let win = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true  //require같은 기능 사용 가능하도록
    }
  });
  win.loadFile('./html/index.html');
  initTrayIconMenu();
}
app.on('ready', createWindow);