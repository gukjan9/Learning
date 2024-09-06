const { contextBridge, ipcRenderer } = require('electron');

contextBridge.exposeInMainWorld('electronAPI', {
  onTrayClick: (callback) => ipcRenderer.on('tray-click', (event, message) => callback(message)),
});