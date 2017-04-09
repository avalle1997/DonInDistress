# Don in Distress


Note: The GUI(PlayGameGui) contains many bugs and was not completed. So far, it only allows the user to stay in one room and select options but the images do not change as the function wasn't included and the final hangman game and room was not included either. It is provided here for possible future fixing but in no way provides efficiency or completion.
+ frame type that requires the programmer to manually enter the coordinates of the labels and text. This frame is most likely the most bug prone relative to the other types.
+ not finding the way to appropriately fix the image name to Jbutton in the GUI
Fundamentally, this code has not been cleaned up and the bugs that arise dont appear to be able to be consolidated. When running, certain JButtons will not appear unless the user hovers over the program with the cursor.

The evil dragon has the damsels don! Go through the dungeon to try to find dame and save him.

Note:
This best accessed using a computer terminal or an IDE.

General:
When playing the game using the PlayGame driver, the program prompts the user with text through the interactions panel and allows the user to respond using text input. The numbered square brackets represent the rooms that are connected to the current room the player is int. A plus sign indicates that the door is unlocked and a negative sign indicates that the door is locked. To unlock a locked door, the user is prompted with a set of ten keys, from which they have three chances to choose the correct one to unlock the door (later versions of the game can include more interesting text interactions with the doors and keys).

Once the user successfully makes their way through the map and enters the 10th room[in this case], they are prompted to play a game of hangman to save the don in distress who is being held captive by a dragon. 

If the user correctly guesses the phrase before they run out of chances, a congratulatory message appears on the screen and the user is asked whether or not they wish to replay the game.

If the user does not guess the phrase correctly before running out of chances (6 wrong guesses are allowed), the don in distress is hidden in a new location by the dragon and the user is asked if they wish to replay the game.
