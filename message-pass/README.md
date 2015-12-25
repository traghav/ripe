#Pass the Message

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