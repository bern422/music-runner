          _______  _        _______  _______  _______  _______ 
|\     /|(  ____ \( \      (  ____ \(  ___  )(       )(  ____ \
| )   ( || (    \/| (      | (    \/| (   ) || () () || (    \/
| | _ | || (__    | |      | |      | |   | || || || || (__    
| |( )| ||  __)   | |      | |      | |   | || |(_)| ||  __)   
| || || || (      | |      | |      | |   | || |   | || (      
| () () || (____/\| (____/\| (____/\| (___) || )   ( || (____/\
(_______)(_______/(_______/(_______/(_______)|/     \|(_______/
                                                               
      _________ _______                                        
      \__   __/(  ___  )                                       
         ) (   | (   ) |                                       
         | |   | |   | |                                       
         | |   | |   | |                                       
         | |   | |   | |                                       
         | |   | (___) |                                       
         )_(   (_______)                                           
                                                               
 _______           _______ _________ _______                   
(       )|\     /|(  ____ \\__   __/(  ____ \                  
| () () || )   ( || (    \/   ) (   | (    \/                  
| || || || |   | || (_____    | |   | |                        
| |(_)| || |   | |(_____  )   | |   | |                        
| |   | || |   | |      ) |   | |   | |                        
| )   ( || (___) |/\____) |___) (___| (____/\                  
|/     \|(_______)\_______)\_______/(_______/                  
                                                               
 _______           _        _        _______  _______  _       
(  ____ )|\     /|( (    /|( (    /|(  ____ \(  ____ )( )      
| (    )|| )   ( ||  \  ( ||  \  ( || (    \/| (    )|| |      
| (____)|| |   | ||   \ | ||   \ | || (__    | (____)|| |      
|     __)| |   | || (\ \) || (\ \) ||  __)   |     __)| |      
| (\ (   | |   | || | \   || | \   || (      | (\ (   (_)      
| ) \ \__| (___) || )  \  || )  \  || (____/\| ) \ \__ _       
|/   \__/(_______)|/    )_)|/    )_)(_______/|/   \__/(_)      
                                                           


Inside this project directory you will find all source code as well as a
Desktop executable and shortcut for Music Runner. 



===============================================

~~~~~~~~~~~~~ REQUIREMENTS ~~~~~~~~~~~~~~~~~~~~

===============================================

This program runs on Windows 7 or later.

You must have the latest version of Java to run Music Runner.

Additionally, if you wish to generate levels, you must have
Anaconda Python installed in your PATH variable. Otherwise, the only 
levels you can play are the pre-generated ones.

Anaconda Python can be found below:
https://www.continuum.io/downloads


===============================================

~~~~~~~~~ LAUNCHING MUSIC RUNNER ~~~~~~~~~~~~~~

===============================================

To run music runner, navigate to the project directory. Then, navigate to
game\android\assets\app. You may run the "Music Runner" shortcut to launch 
the game. You may move this shortcut anywhere (for instance, to the Desktop).

===============================================

~~~~~~~~~ COMPILING MUSIC RUNNER ~~~~~~~~~~~~~~

===============================================

The only file that needs to be compiled to create the Desktop application
is desktop/src/com/sp/game/desktop/DesktopLauncher.java and all its
dependencies (located in the core/src folder). LibGDX must be installed,
Python must be configured to run on the PATH variable, and SciPy and
NumPy must be included in the project (or use Anaconda Python).



===============================================

~~~~~~~~~~~~~~~~ SCREENS ~~~~~~~~~~~~~~~~~~~~~~

===============================================

1. Main Menu

  - After loading, you will see the Main Menu Screen. You will have 3 options:
	1. Play song
	2. Song Manager
	3. Exit

  1. Play Song
	- Any songs you have loaded will appear here. Initially, this will only contain
	demo songs. Upload your own for more!
	- Tip: If you just want a taste of Music Runner, the demo song "Demo"
	is only 10 seconds long!

  2. Song Manager
	- This lets you add or remove songs. To add a song, click "Add". Enter
	the name of a song you wish to add in your "songs" directory (see
	"Songs" section below). Click OK. The name will appear in the list
	as a red entry, until it finishes, where it will turn white.
	- To remove a song, simply click it and then "remove".

  3. Exit
	-Exits the application safely.


===============================================

~~~~~~~~~~~~~~~~~ SONGS ~~~~~~~~~~~~~~~~~~~~~~~

===============================================

You'll notice that only a few songs are initially available: however, you can add your own!

Inside the project directory, navigate to game/android/assets/music. This is where all the song files
are located! Unfortunately, the only currently supported audio type is .wav files. However, you can
convert your mp3 files into playable .wav files for free via the following link:

http://audio.online-convert.com/convert-to-wav

Place your .wav files in here, and then in the application, you can go to the Song Manager Screen
and simply enter the name of the .wav file (with or without the ".wav" at the end) and your song
will be loaded!


===============================================

~~~~~~~~~~~~~~~~ CONTROLS ~~~~~~~~~~~~~~~~~~~~~

===============================================

Your character will always be running to the right. The following controls
are supported:

1) Jump: SPACE bar, the W key, or the up arrow on the bottom right side 
of the screen.

2) Fire: Simply click the region of the game screen where you wish to fire and
a projectile will fire. Holding down will fire rapid fire shots.

3) Bounce: Before landing on an enemy and stomping them, press 'Jump' again
to get an extra boost! Don't get stuck bouncing on small enemies and run into
a bigger one!

4) Reload: the "R" key. Note that it takes a few seconds to reload. If your ammo
reaches zero, you will automatically reload.
  


===============================================

~~~~~~~~~~~~~~~~ GAMEPLAY ~~~~~~~~~~~~~~~~~~~~~

===============================================

Your character will run to the right as the song begins to play. You will notice
a variety of enemies come into view and arrive at your location as musical
features occur. If you run into an enemy on the side, you will lose health.

To kill an enemy:
	1. Stomp on its head by jumping
	2. Shoot it

Collect headphones in the air for extra points and to restore life points!

When you successfully complete a level, you will reach the finish flag and win the game!

If you run out of lives before reaching the finish, you will lose the game.

Either way, you may return to the main menu to continue playing. 


===============================================

~~~~~~~~~~~~~~~~ STRATEGY ~~~~~~~~~~~~~~~~~~~~~

===============================================

Exclusively jumping or shooting will NOT allow you to survive an entire round for most songs - 
you must be smart and combine your efforts! You have a limited ammount of ammo, so use it wisely
and remember to reload! Try jumping along multiple similar sized enemies. When a larger one approaches,
try bouncing to increase your jump height, or begin shooting them so you may safely land. Stomp 
chaining is a good strategy because it simultaneously picks up headphones, restoring precious
life points. Good luck!