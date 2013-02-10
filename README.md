Magic
=====

 Description
 ===========
This game is under development
We will be back with a description later...

 How to install?
 ===============
At this point, Magic can not be installed.
The game is not at all close to playable (we have just started)

 Slick2D Netbeans setup (For development)
 ======================
1. Right-click project and go to "Properties"
2. Go to "Libraries"
3. Click on "Add JAR/Folder
4. Browser to the project
5. Go to libs\Slick2D\Jars
6. Select lwjgl.jar and slick.jar and click "Open"
7. Go to "Run" on the left
8. Paste this into the "VM Options" field: -Djava.library.path="PATH_TO_YOUR_NATIVES"
9. Change the path to the natives

 Now, what is the natives, and where do i find them? (For development)
 ===================================================
The natives are files that are used to compile the graphics, sound etc.
There are natives for the following platforms: Windows, Linux, Mac OS X, and Solaris.

You can find the natives in this path "[PROJECT_PATH]\libs\Slick2D\Natives\[CHOOSE A PLATFORM]"

Eksampel path: C:\Users\[USER]\Dropbox\GitHub\Magic\Magic_Gitub\libs\Slick2D\Natives\windows

When all this is done, you should be good to go.
