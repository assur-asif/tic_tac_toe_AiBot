# Project: Tic Tac Toe AI Console Game
A console Tic Tac Toe implementation in Java with a Minimax-based AI, demonstrating game logic, recursion, and optimal decision making.

## 1. Introduction

Hello everyone.  
This is my Tic Tac Toe game built in Java.
It is a terminal-based game where a human player competes against an AI that uses the Minimax algorithm to make optimal decisions.

## 2. Running the Game

First, I compile the project:
javac asif/ttt/*.java
Then I run the game:
java asif.ttt.App

## 3. Game Start

The game starts with an intro screen and asks for the player name.

I enter my name.

The game explains that:
- I play as X
- The computer plays as O
- I can choose positions from 1 to 9

The board layout is shown like this:

1 | 2 | 3  
---------  
4 | 5 | 6  
---------  
7 | 8 | 9  


## 4. Gameplay

Now I make the first move.

For example, I choose position 5.

The board updates and shows my move.

Now the computer plays.

You can see a short delay and a "thinking" animation, which makes the gameplay more interactive.

The computer then selects its move using the Minimax algorithm.

This continues turn by turn:
- I make a move
- The AI responds optimally

---

## 5. Game Result

The game continues until:
- Either the player wins
- The computer wins
- Or the game ends in a draw

At the end, the result is displayed clearly.

---

## 6. Replay System

After the game ends, I am asked:

"Do you want to play again?"

If I type "yes", the game restarts.  
If I type "no", the program exits.

---

## 7. AI Explanation:

The AI uses the Minimax algorithm.

It evaluates all possible future moves and always chooses the best one.

Because of this, the AI is very difficult to beat.

---

## 8. Conclusion:

This project demonstrates:
- Object-oriented design in Java
- Game logic implementation
- Use of the Minimax algorithm
- User interaction in a terminal environment

## 9. Information:

Author: Ali Hosen Asif
Version: 1.0
Date: May 1, 2026

Thank you.
