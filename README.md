#Ripe
Solutions to varied problems found here and there. 


###Bouncy Problem
Euler 112
__________

Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; for example, 134468.

Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 66420.

We shall call a positive integer that is neither increasing nor decreasing a "bouncy" number; for example, 155349.

Clearly there cannot be any bouncy numbers below one-hundred, but just over half of the numbers below one-thousand (525) are bouncy. In fact, the least number for which the proportion of bouncy numbers first reaches 50% is 538.

Surprisingly, bouncy numbers become more and more common and by the time we reach 21780 the proportion of bouncy numbers is equal to 90%.

Find the least number for which the proportion of bouncy numbers is exactly 99%.

** Getting 21791 instead of 21780 for p(0.9). Can't see any implementation errors. Using float gives slightly different results.

** 1587097 is the answer

____________

###Pass the Message

Tomas has found out that in one hour there will be a free acting class by a famous actor. He’s going to attend and wants to invite his friends from his evening acting class. 
Unfortunately, his mobile phone is dead and he needs to call someone from the class to pass the message to the others. 

He’s got his friend's numbers and also the contact information of each member in the class. Who should he call if he wants information to be propagated throughout the group in minimal time?

When a member of the group receives the message he sends it to all his contacts (apart from the one he received it from). This is the first step. The next person who receives the message sends it to their contacts in turn, which is the second step. And so on for third, fourth and further steps.

Once this process is complete, we should understand the number of steps needed to notify all members.

*Input*
First line will contain the number of test cases T.
T blocks will follow with:
First line will contain the number of Tomas’s friends N
The next N lines contain information about each of the friends contacts: indexes of friends whose contacts this friend has. Indexes start from 1.

*Ouput*
T lines (one line for each test case) 
Each line should contain an index of a friend whom Tomas can call if he wants to notify the group in the shortest time.
If there are several such friends, put their indexes in ascending order.
If no such friends exist put 0.

______________