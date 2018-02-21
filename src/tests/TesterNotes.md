Tester Notes
=====

* Class representing locations/squares
	* new location has no mine set?
	* does setting a mine correctly change mine state?
	* if there's a `toString()` method, does it give correct values for hidden vs. flagged vs. unhidden w/number of surrounding mines?

* Class representing the minefield and associated logic (possibly in separate class)
  * for a new minefield, is there a correct number of mines set?
  * when a minefield's size is specified, is the field's size correct?
  * inspecting locations
    * does inspecting a mined location result in a loss?
    * does inspecting a location with 1+ adjacent mines allow game to continue?
    * does inspecting last non-mined square result in a win?

* Controller -- **may be tested by a human playing the game**
  * does a win or loss allow the user to play again without restarting the application?
  * does non-standard input (e.g., `i a 6`) **not** crash the application?
  * does input with extra spacing and different cases (upper/low) work?  For example:
```
i   a6
  f b3
u C7
Q
```
