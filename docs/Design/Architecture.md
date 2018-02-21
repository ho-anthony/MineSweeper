Design Document for Team D's MineSweeper
===

## Overview
Our MineSweeper game contains 3 classes. The classes are `Controller`, `MineField`, and `Square`. The `Controller` class is the driver of the project and contains the methods and commands that allow the user to interact with the game. Depending on what the user inputs in the `Controller` class, the `MineField` and `Square` class will change accordingly. The `MineField` class contains a 2D array of the grid. Each `Square` in the grid can be interacted/changed depending on which method is called in the `MineField` class from the `Controller`. The `Square` class contains the methods that create the mines, flags and numbers that are in the game.

## Classes
### `Controller`
This class is especially for running the game. The `Controller` class connects to the `Minefield` class and is functioned based on player's input in the Scanner. When player types the command, the `Controller` class will run its while loop, if statement and switch-case-break to respond to player's command. The `Controller` starts by asking player to choose a difficulty, then the `Controller` will call `MineField` to make a size of `MineField` that the player wants. Then, player will ask to type in command to play the game. Player will type "i" for inspect, "f" for flag, "u" for unflag and "q" to quit the game. Every input the player types in the `Controller` class, the `Controller` class will call the corresponding method in the `MineField` class. The `Controller` will recognize invalid input and ask player to type in again.  
### `MineField`
This class creates the grid of the game as well as the methods mentioned in the `Controller` class. The `Controller` class calls upon the methods created in the `MineField` class, sending it a location and a task. The `Minefield` class runs the task specified(method) on the location given. The `MineField` class also calls upon the `Square` class, since the 2-D array in MineField is created with square objects. Furthermore the methods created in the class, call upon the methods in `Square` class, such as the inspect method which use's the `Square` class's `isInspected()`, `hasMine()` and `setNumber()`. The `MineField` class is also what draws the visual representation of the grid. 
### `Square`
The `Square` class creates the mine, flag, and checks the square in minesweeper. This class represents each individual spot on 
the grid of the game; either flagged, empty, has mine, or has a number. `Square` connects with `MineField` by connecting the 
methods into the inspect(), unFlag(), flag(), and setMinePosition(). The `inspect` method inspects the `Square`, which basically checks if
a mine is near by or if it hits a mine, the score for a loss will increase by one and if it has no mines it will keep checking 
around until it hits a number. The flag() method uses the `Square` class to set a flag on the grid at the given location; the unflag method will unflag the flag at the given location. The setMinePosition() uses the `Square` class to set the mine position randomly on the grid.


