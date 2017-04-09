# Don in Distress

---PROGRAM REFLECION---


 CREATING A NEW GAME MAP
 + Create a .tgf with vertices that correspond to a saved image file name.
 + Not include multiple edges of the same weight unless it is of weight 0.
 + Must create the needed Text file for the Key and Dictionary in the exact format specified throughout the program.
 
 ISSUES:
 + GUI does not work because of bug prone selected frame. Therefore was not completed
 + might have been more efficient to create a Graph where V--> Rooms and E--> Doors because you would need to implement less methods and
 use less data structures. Big O Notation would need to be tested examing the effect as the graph sizes get larger
 
 OPTIMIZATION:
 + Uses Tgf which the user can create using software such as yED. User can create any sized Graph with any number of rooms and doors
 as long as they update the text for the key and Door in order to include more number of distict doors
 + Prevent players from entering invalid responses in the terminal version of the game
 
  POSSIBLE FUTURE GAME EXPANSION: 
 + Control more of the IO input.
 + Automatically determine best starting and final room and sets it
 + Use polymorphism to create diversity in key door interaction.
 + More game features such as mingames, player character
 + Store many different game maps in the program for if the player wants to continously play
 
 ---MORE ON THE GUI---
The GUI(PlayGameGui) contains many bugs and was not completed. So far, it only allows the user to stay in one room and select options but the images do not change as the function wasn't included and the final hangman game and room was not included either. It is provided here for possible future fixing but in no way provides efficiency or completion.
+ frame type that requires the programmer to manually enter the coordinates of the labels and text. This frame is most likely the most bug prone relative to the other types.
+ not finding the way to appropriately fix the image name to Jbutton in the GUI
Fundamentally, this code has not been cleaned up and the bugs that arise dont appear to be able to be consolidated. When running, certain JButtons will not appear unless the user hovers over the program with the cursor.
 
 ---GAME LAYOUT--- 
Since the game GUI is still ineffective, it is best if the user sets it up on an IDE or terminal, running it from the playDriver class.

 TRAVERSING:Every key value present contains a corresponding door value in which they interact together depending on
 the decisions the user makes. These values are saved in their own dictionary. Every room contains keys that corresponds
 to all of the weighted edges[represented as doors]that connect to other rooms. In total, every room contains 
 10 keys where some keys correspond to a door that connects from the room as some that are used merely to challenge 
 the player.
  
 ORIENTATION: The number value assigned to the room name is used to help the user orient themselves around the game.
 The structure is maze like and therefore, the user cannot enter the same room various times in order to find the end.
 
 HOW TO WIN: The player does not necessarily need to unlock all the doors but must reach the assigned final room and
 complete the minigame. What's more, the player needs to not run out of chances or the lose the game.


---GENERAL---
When playing the game using the PlayGame driver, the program prompts the user with text through the interactions panel and allows the user to respond using text input. The numbered square brackets represent the rooms that are connected to the current room the player is int. A plus sign indicates that the door is unlocked and a negative sign indicates that the door is locked. To unlock a locked door, the user is prompted with a set of ten keys, from which they have three chances to choose the correct one to unlock the door (later versions of the game can include more interesting text interactions with the doors and keys).

Once the user successfully makes their way through the map and enters the 10th room[in this case], they are prompted to play a game of hangman to save the don in distress who is being held captive by a dragon. 

If the user correctly guesses the phrase before they run out of chances, a congratulatory message appears on the screen and the user is asked whether or not they wish to replay the game.

If the user does not guess the phrase correctly before running out of chances (6 wrong guesses are allowed), the don in distress is hidden in a new location by the dragon and the user is asked if they wish to replay the game.
