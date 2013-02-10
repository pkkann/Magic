Magic
=====

A magic game

This game is under the development.

I will be back with details later...

### Slick2D Netbeans setup
1. Right-click project and go to "Properties"
2. Go to "Libraries"
3. Click on "Add JAR/Folder
4. Browser to the project
5. Go to libs\Slick2D\Jars
6. Select lwjgl.jar and slick.jar and click "Open"
7. Go to "Run" on the left
8. Paste this into the "VM Options" field: -Djava.library.path="PATH_TO_YOUR_NATIVES"
9. Change the path to the natives

### Now, what is the natives, and where do i find them???
The natives are files that are used to compile the graphics, sound etc.
There are natives for Windows, Linux, Mac OS X, and Solaris.

You can find the natives in this path "[PROJECT_PATH]\libs\Slick2D\Natives\[CHOOSE APLATFORM]"

Eksampel: C:\Users\[USER]\Dropbox\GitHub\Magic\Magic_Gitub\libs\Slick2D\Natives\windows

When all this is done, you should be good to go.

These steps should only be done once pr project.
