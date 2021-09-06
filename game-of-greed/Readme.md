#Game of Greed 

## Instructions

Greed is a press-your-luck dice rolling game. In the game, the player rolls the dice and tries to earn as many points as possible from the result. 
The round stops when:
- the player roll a six
- the player stops by himself. That allows to compute the round score and add it to his overall score.
The game stops when a player reach a given number of points.

Write a scoring method that calculates the score based on a given roll using the following set of scoring rules. Each die can only be scored once (so single die scores cannot be combined with triple die scores for the same individual die, but for instance four 5s could count as 1 Triple (500) and 1 Single (50) for a total of 550.
The method accept any number of die.

- A single one (100 points)
- A single five (50 points)
- Less than three of a kind for 2, 3 or 4: 0 points
- Triple ones [1,1,1] (1000 points)
- Triple twos [2,2,2] (200 points)
- Triple threes [3,3,3] (300 points)
- Triple fours [4,4,4] (400 points)
- Triple fives [5,5,5] (500 points)
- At least a six: the score is 0 whatever are the other die

## Example Scores

- [1,1,1,5,1] = 1150 points
- [2,3,4,6,2] = 0 points
- [3,4,5,3,3] = 350 points
- [2,2,3,4,3,4] = 0 points

## Resources

- [Greed Dice Game (aka Farkle) on Wikipedia.org](http://en.wikipedia.org/wiki/Greed_(dice_game))