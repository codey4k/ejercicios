@echo off

goto :main

:tareas_de_inicio

   echo Finalizando tarea powershell.exe

   taskkill /F /IM powershell.exe /T
   
   start taskmgr.exe

   ::pause >nul

goto :eof


:main

   :: echo Se ejecuto la funcion main

   call :tareas_de_inicio

   :: pause >nul

goto :eof