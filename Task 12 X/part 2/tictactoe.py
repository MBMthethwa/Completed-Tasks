import random

class TicTacToeBoard(object):
    board = []
    def __init__(self,board):
        self.board = board
        
        
        
    def drawBoard(self):
        print ('       |       |       |   ')
        print ('   ' + str(board[0]) + '   |   '+ str(board[1])  + '   |   ' + str(board[2]))
        print ('       |       |       |   ')
        print ('---------------------')
        print ('       |       |       |   ')
        print ('   ' + str(board[3]) + '   |   ' + str(board[4]) + '   |   ' + str(board[5]))
        print ('       |       |       |   ')
        print ('---------------------')
        print('       |       |       |   ')
        print ('   ' + str(board[6]) + '   |   ' + str(board[7]) + '   |   ' + str(board[8]))
        print ('       |       |       |   ')

    def oIsAWinner(self):
        
        if board[0] == "O" and  board[1] == "O" and  board[2] == "O" or board[3] == "O" and  board[4] == "O" and  board[5] == "O" or board[6] == "O" and  board[7] == "O" and  board[8] == "O" or board[0] == "O" and  board[3] == "O" and  board[6] == "O" or board[1] == "O" and  board[4] == "O" and  board[7] == "O" or board[2] == "O" and  board[5] == "O" and  board[8] == "O" or board[2] == "O" and  board[4] == "O" and  board[6] == "O" or board[0] == "O" and  board[4] == "O" and  board[8] == "O":
            return True
        else:
            return False
    
    def xIsAWinner(self):
        
        if board[0] == "X" and  board[1] == "X" and  board[2] == "X" or board[3] == "X" and  board[4] == "X" and  board[5] == "X" or board[6] == "X" and  board[7] == "X" and  board[8] == "X" or board[0] == "X" and  board[3] == "X" and  board[6] == "X" or board[1] == "X" and  board[4] == "X" and  board[7] == "X" or board[2] == "X" and  board[5] == "X" and  board[8] == "X" or board[2] == "X" and  board[4] == "X" and  board[6] == "X" or board[0] == "X" and  board[4] == "X" and  board[8] == "X":
            return True
        else:
            return False
        
    
    def boardfull(self):
        count = 0;
        if board[0] == "X" or board[0] == "O":
            count = count + 1
        if board[1] == "X" or board[1] == "O":
            count = count + 1
        if board[2] == "X" or board[2] == "O":
            count = count + 1
        if board[3] == "X" or board[3] == "O":
            count = count + 1
        if board[4] == "X" or board[4] == "O":
            count = count + 1
        if board[5] == "X" or board[5] == "O":
           count = count + 1 
        if board[6] == "X" or board[6] == "O":
            count = count + 1
        if board[7] == "X" or board[7] == "O":
            count = count + 1
        if board[8] == "X" or board[8] == "O":
            count = count + 1

        print "Round " + str(count)
        if count == 9:
            return True
        else :
            return False
        
            
        
    def returnAWinner(self):
        
        if self.boardfull():
            print "No Winner it is a Draw"
        elif self.xIsAWinner():
            return "X"
        elif self.oIsAWinner():
            return "O"
        else:
            return "continue"
        
    

class Piece(object):

    def __init__(self, value):
        self.value = value

            
class X(Piece):
    def __init__(self, value):
        self.value = "X"

    def X(self):
        return self.value

class O(Piece):
    def __init__(self, value):
        self.value = "O"

    def O(self):
        return self.value
    



# populate a board
board = ["0","1","2","3","4","5","6","7","8"]

#When the program runs we call a tic tac toe board
ticTacToeBoard = TicTacToeBoard(board)
ticTacToeBoard.drawBoard()

    #Two players, player and computer.
    # player will be a person challenging a computer
    #we will assume x = 1 and o = 0
    
    #to choose which player must start will choose using random.
    #We assume computer = 1 and player = 0
player = random.randint(0,1)

    #If player = 0, which means computer will start to play by choosing space free space on thet board. if it not free, it will continue unitil it get it.
    #The first player must use letter x
if player == 0:
    
    while ticTacToeBoard.returnAWinner() == "continue":
        
        computerChoice = random.randint(0,8)
        
        while board[computerChoice] == "X" or board[computerChoice] == "O":
            computerChoice = random.randint(0,8)    

        board[computerChoice] = "X"
        ticTacToeBoard.returnAWinner();
        print "updated board" 

        ticTacToeBoard.drawBoard()
        print "Rememeber you can only place your piece on spaces where there are number "
        playerChoice = int(raw_input("Enter the number where you want to place your piece  "))

        while board[playerChoice] == "X" or board[playerChoice] == "O":
            playerChoice = int(raw_input("Enter the number where you want to place your piece "))

        board[playerChoice] = "O"
        ticTacToeBoard.returnAWinner();
        print "updated board"

        ticTacToeBoard.drawBoard()
            
elif player == 1:
    while ticTacToeBoard.returnAWinner() == "continue":
        
        print "Rememeber you can only place your piece on spaces where there are number "
        playerChoice = int(raw_input("Enter the number where you want to place your piece  "))

        while board[playerChoice] == "X" or board[playerChoice] == "O":
            playerChoice = int(raw_input("Enter the number where you want to place your piece "))

        board[playerChoice] = "X"
        ticTacToeBoard.returnAWinner();
        print "updated board"

        ticTacToeBoard.drawBoard()
        computerChoice = random.randint(0,8)
        
        while board[computerChoice] == "X" or board[computerChoice] == "O":
            computerChoice = random.randint(0,8)    

        board[computerChoice] = "O"
        ticTacToeBoard.returnAWinner();
        print "updated board" 

        ticTacToeBoard.drawBoard()

if ticTacToeBoard.returnAWinner() == "O":
    print "O is a winner "
elif ticTacToeBoard.returnAWinner() == "X":
    print "X is a winner "

    
        

        
        
    





