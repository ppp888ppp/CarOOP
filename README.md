# Cars w/ Object Oriented Programming 

## Description 
 
* This program will be very similar to the previous iterations of the Car and CarArrays in the repository, however, we’ll now be instantiating Car objects. The Car class should have an ignition, a color, and a position (given by an x coordinate and a y coordinate) as well as various methods to generate and change these instance variables. 
 
* The ignition state and the position state may change during the course of the program’s execution, but the color will stay the same. 

* Before the user is given control of the car via the menu, the car’s attributes should already be assigned (i.e., it will have its ignition set to “off”, it will be given a color, and it will have random position coordinates). The car’s current location will be represented by a char that stands for its color (e.g., “R” for red). Available colors are: Red, Green, Blue, White, Silver (R, G, B, W, S). The ignition can be set to either on (True) or off (False). 
 
* The user should be prompted to choose a car and then, once a car is selected, the user can (i) turn the ignition on/off; (ii) move the car around the 20x20 grid; (iii) change cars; or (iv) quit the program. 
 
* Specific error checking will be expected. The car should be prevented from going out of bounds and, if the ignition is off, the car should not be able to move anywhere. 
 
* Lastly, the most current grid and the status of the car should be printed after each user action (i.e., turning the ignition on/off, legal movement of the car, and when the user chooses to quit). 




 ## Methods to implement 

* *assignColor*: Randomly picks one of the five colors (represented by a char) and returns the corresponding char. This method should be called once from the Car's class constructor. The color will not change during the execution of the program. 
 
* *moveHorizontal*: This method will need the number of spaces you would like to move the car (a negative value will move the car left; positive value will move the car right) and will adjust the xPosition of the car. If the car's ignition is not on, this method tells the user that s/he must turn the ignition on first and leaves the xPosition unchanged. 
If the user tries to move the car beyond the border of the 20x20 grid, this method reports an informative error message and leaves xPosition unchanged. 
 
* *moveVertical*: This method will need the number of spaces you would like to move the car (a negative value will move the car up; positive value will move the car down) and will adjust the yPosition of the car. If the car's ignition is not on, this method tells the user that s/he must turn the ignition on first and leaves the yPosition unchanged. 
If the user tries to move the car beyond the border of the 20x20 grid, this method reports an informative error message and leaves yPosition unchanged. 
 
 * *getGrid* : This method will draw the 20 * 20 grid when it is called.
 
* *ignitionSwitch*: This method will turn the car off when it is on or on when it is off. (i.e. change the value of the instance variable). 
 
* *getColor*: This method will return the color of the car as string. 

* *getIgnition*: This method will return the ignition status of the car as a boolean variable 
 
* *getX*: This method will return the x position of the car as an int. 

* *getY*: This method will return the y position of the car as an int.  

* *toString*: After each action, you should print the "state" of the currently modified Car. This method will call the “get” methods and report the status of each (including a copy of the Car’s position in the grid). See “Car Information” above in the Example Output. 


## Let's Play This!
1. The user is asked to choose the car number between 1 - 10
2. The program will present the user the status of the car selected. 
3. The user could have some options to be executed. 
3. As for the movement option, the secondary menu should be generated within the main() method. Once the user makes a valid choice and enters a movement distance, one of the two methods may be called.  
4. The program should be able to handle invalid input at the main menu (e.g., the user inputs “zzz”) and print a message to let the user know that what they just entered cannot be accepted. Similar error checking should occur at the movement menu, when the user inputs either “H” or “V”. You may assume that the movement distance will always be an integer, but you cannot assume that the movement will not potentially move the car out of bounds.

 
## Example Output  
Enter a number between 1-10 to select a car:

Input: 3 


 
 
 
Car #3 Information 
 
 Color: Red
 
 Ignition: Off 
 
 Location: (5, 7)
 
![Capture](https://user-images.githubusercontent.com/51673576/64493134-2c0d6900-d24a-11e9-88bf-5acd1088684e.JPG)

 
 
 
 
 
What would you like to do?

  1: Turn the ignition on/off
  
  2: Change the position of the car 
  
  Q: Quit this program 
  
  Input: 1 
  
 
  

Car #3 Information
  
  Color: Red 
 
 Ignition: On 
  
  Location: (5, 7) 
  
  
![image](https://user-images.githubusercontent.com/51673576/64493139-40516600-d24a-11e9-9e9e-6d046f947c1e.png)

