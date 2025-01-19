package machineCoding.codingQuestions;

public class Questions {
    /*
    Design of Movie ticket booking system
Interviewers Feedback : Emphasize more on Design principles, Database schema design and end-to-end flow rather than creating object and class relation. Was good on requirement collections. However I answered all questions he asked and I felt it was okay.

 LLD -> Card Game

Design an extensible solution to implement a search filter in OOD for a directory, matching files by size or name.
Design a library to read a directory and perform operations such as filtering by file type and size constraints.
Design a job scheduler.
Design an inventory management system with queuing for incoming requests.
Design a data structure similar to a HashMap.
Create a class diagram for a standalone chess game and explain design decisions with pseudo code for piece movements.
Create the low-level design of a download manager capable of handling multiple downloads.
https://leetcode.com/discuss/interview-experience/6075975/Amazon-SDE2-50-posts-in-1-DSA%2BLP%2BLLDHLD


Design OOD Pizza Store
Write program to calculate price.
-base, - size, - toppings
That was it. had to be creative and write efficient object oriented code.
https://leetcode.com/discuss/interview-experience/5865413/Amazon-or-SDE2-or-Seattle-or-Sep-'24-or-Reject


Round 2 (LLD): Weak hire
	• 2 LP questions (Dive deep, Insist on higher standards)
	• Low level design for a real-time collaborative document editing platform like Google Docs


Implement 2 APIs: one to track user visits, the other to return the first user to visit only once. Follow-up: return the first N users who visited only once.
https://leetcode.com/discuss/interview-experience/5841795/Amazon-or-SDE2-or-Bellevue-or-Sep-'24-Offer


Design a solution in OOD, extensible solution to implement search filter when given a path to directory and find all files with matching filters like by size or name


Problem statement:
Design Unix File Search API to search file with different arguments as "extension", "name", "size" ...
The design should be maintainable to add new contraints.
https://leetcode.com/discuss/interview-question/609070/amazon-ood-design-unix-file-search-api

List of others OODs collected by @goCoronaGo
	• Library Management System
	• Parking Lot
	• Amazon (Online Shopping System)
	• Stack Overflow
	• Movie Ticket Booking System (BookMyShow)
	• ATM
	• Airline Management System
	• Blackjack and a Deck of Cards
	• Hotel Management System
	• Restaurant Management System
	• Chess
	• Online Stock Brokerage System
	• Linkedin
	• Crickinfo (Sports Website)
	• Facebook (Social Network)
	• Cab Booking (Uber)
	• Chatting
	• Calendar
	• Blog Site
	• Food Delivery
Another list from @242jainabhi:
	• Vending Machine
	• Traffic Lights
	• Elevator
	• Meeting Scheduler
	• Car Rental

https://leetcode.com/problems/design-file-system/description/


followed by a LLD to desing a library that reads a directory and do some opeartions over the files, like filtering by type and constraing about file size. I drowned myself on this one, was exausted at the end and couldn't think straight.


Given
	• Users should be able to use a code to open a locker and pick up a package
	• Delivery guy should be able to find an "optimal" locker for a package
Then
	• Free coding from scratch in any language
What I did
I used Vec<Locker> to represent the state.
The interviewer asked if I can improve the code.
I told I could probably use a HashMap (Size -> Locker) if there are standard sizes like (small, medium, large instead of (w,h,d))
https://leetcode.com/discuss/interview-question/system-design/233869/Design-Amazon-Locker-system


Round 3 - LLD
2 LP questions, the problem of designing a task scheduler. Additionally, the interviewer explored multiple aspects related to estimating the completion time for tasks within the scheduler. I was able to come up with the high-level plan first and later on drew the UML diagram showing the user journey.





Uber
Cache with get/set/expire, how to handle concurrent request.
Concurrent dictionary
Bookmyshow -  https://leetcode.com/discuss/interview-experience/5860469/Uber-or-SDE-2-or-Blr-or-Rejected-or-August-2024
Parking system
Splitwise
Meeting room
JS task runner
Netflix - Top 10 movies
PubSub
Logging library
Text editor
Flight booking https://www.sartiano.it/marco/diigo/System%20Design/Grokking%20the%20Object%20Oriented%20Design%20Interview.html

PubSub
In this round, I was asked to design a multi-threaded pub-sub system that can support multiple publishers and subscribers. The focus of the interview was to write a production-ready runnable code using threads.
Result: I was able to discuss the approach and have an executable code in 1 hour but it didn't print the output due to a small bug. However the interviewer was happy with the approach, design, and implementation.
https://leetcode.com/discuss/interview-experience/5295684/Uber-or-SDE2(L4)-or-Bangalore-or-June-2024-Accepted
Design a system like kafka with concurrency support
Concurrent In-memory Publisher-Subscriber System

Task Runner
Machine Coding Round / Specialization round
JS task runner implementation with dependencies. Solution related to graph traversal and knowledge about JS setTimeouts / Promises
https://leetcode.com/discuss/interview-experience/5155310/Uber-L4-interview-experience
Implement an InMemory Task scheduler Library that supports these functionalities:
Submit a task and a time at which the task should be executed. --> schedule(task, time)
Schedule a task at a fixed interval --> scheduleAtFixedInterval(task, interval) - interval is in seconds
The first instance will trigger it immediately and the next execution would start after interval seconds of completion of the preceding execution.
If a task has an interval of 10 seconds and submitted at 2:00 pm then
It will be executed at 2:00 pm
Once the execution is completed + 10 seconds(interval) it will trigger the next execution and so on.
Expectations
The number of worker threads should be configurable and manage them effectively.
Code/Design should be modular and follow design patterns.
Don’t use any external/internal libs that provide the same functionality and core APIs should be used.
https://leetcode.com/discuss/interview-question/891551/uber-experienced-2020-machine-coding-round
Java implementation https://akhiilgupta.medium.com/design-a-multi-threaded-task-scheduler-lld-multi-threaded-construct-eb090c5a8727

Logging library
Question: Well defined logging library API with get and set methods. Data was expected to be handled in memory.
Performance: First implemented functionally complete solution with appropriate design patterns such as singleton and fluent. Then discussed and partially implemented improvements such as concurrency handling with locking and time complexity optimization.
https://leetcode.com/discuss/interview-experience/5655907/Uber-or-SDE-2-or-Bangalore-or-July-2024-Offer


Meeting Scheduler
There are multiple meeting rooms
Meeting room can be allocated at any time in a day. There is no constraint on the time.
Meeting room can be occupied for any time duration. Example for 30 mins or may be for 2 hours as well.
Proper error message should be given incase meeting room can't be booked for given time slots.
Objective was to have a fully running/working code at the end of the interview which satisfied all the above constraints.
It was a kind of machine coding round where I designed multiple modules and provide class interactions to creating meetings. I was also code logic to add/delete multiple meeting rooms.
Once I complete the code, interviewer took the access and tried multiple test cases and asked me to fix the failed scenarios. First failed test case was quite easy but another test case would require the complete algorithm change. I explained the new algo to interviewer verbally since we were running out the time.
Round was stretched upto 1.5 hour.
https://leetcode.com/discuss/interview-experience/4137694/Uber-or-SSE-or-Hyderabad-or-September-2023
https://leetcode.com/discuss/interview-experience/5551829/Uber-or-SDE-2-or-BLR-or-Rejected
https://leetcode.com/discuss/interview-experience/3578687/Uber-Staff-Software-Engineer-(L5B)
Design Meeting scheduler. Asked a lot of questions around it. Discussed the approach and wrote the solution. This was more of a machine coding question.
https://leetcode.com/discuss/interview-experience/2862727/Uber-or-SDE2-or-Hyderabad-or-Nov-2022-or-Selected

Question was a variation of meeting scheduler. N rooms are given and streams of times will be given and we have to schedule meeting. After storing the meeting we have to store audit logs for each room. We have to delete audit logs after x days. Follow up questions were that rooms will have capacity constraints so that we have to check if we can organize meeting with given capacity. Also we have to minimize spillage of free time while scheduling meetings.
Spillage eg: if room1 is free from 9-10 am and room2 is free from 9am - 12pm and if a meeting comes for 9-10 am then we should assign it to room1 as room1 will be booked for day . Concurrency handling was expected.
https://leetcode.com/discuss/interview-experience/5273112/Uber-or-L4-or-Bangalore-or-Offer


Text Editor
You need to implement a text-editor which can have below 4 operations. The operations need to be performed in chronological order.
Append - It will append the current string.
Backspace - It will delete the last character of the editor.
Undo - It will remove the effect of the last operation performed.
Redo - It will perform the redo operation. The condition is you can only perform this operation if the last operation is Redo/Undo operations.
https://leetcode.com/discuss/interview-experience/3657138/Uber-oror-SDE-1-Interview-Experience-oror-On-campus


Facebook
Design Facebook. That was only two words he pasted on the coderpad.
Expected LLD design, incorporate all important design patterns, implement 3 functionalities with production level running code, and multithreading to handle concurrency.
https://leetcode.com/discuss/interview-experience/4854590/Uber-or-SDE-2-or-Offer-or-Bangalore


Design a leaderboard.
Ask 1: Design a simple use case.
Ask 2: Implement caching.
Ask 3: Make it thread-safe.
I completed the first two asks and discussed all possible approaches for the third. I asked for 10 more minutes to implement a keyed executor


You are tasked with implementing a part of the Cart Management, Checkout and delivery module for a food delivery platform like Uber Eats. The module should manage the cart, handle tax calculations, apply promotional discounts, calculate delivery charges, and handle items from multiple restaurants. Additionally, the module should be able to track delivery status and the courier's location.
 Requirements: Cart Management:
 Users should be able to add items from different restaurants to the cart.
 Users should be able to remove items from the cart.
Users should be able to update the quantity of items in the cart.
The cart should support the calculation of the total cost, including tax, promotional discounts, and delivery charges.
Tax Calculation: Calculate tax based on a fixed rate (e.g., 10%).
Promotional Discounts: Apply a simple percentage discount if a promotion is active (e.g., 20% off on total cost).
Delivery Charges: Calculate delivery charges based on a fixed rate per restaurant (e.g., $5 per restaurant).
Delivery Address: Users should be able to set a delivery address for the order.
 Delivery Tracking: Track the delivery status of the order (e.g., pending, dispatched, delivered). Track the courier's current location. P0 The module should manage the cart, handle tax calculations, apply promotional discounts, calculate delivery charges, and handle items from multiple restaurants. Additionally, the module should be able to track delivery status and the courier's Location

User -- Restraunt -- Menu -- MenuItem -- Cart -- AddItem/RemoveItem [Qty]


Splitwise
Implement a Bill sharing system (like Splitwise) that supports: - Addgroup(groupId) - create group if it doesn’t exist. - AddUser(userId, groupId) - add User to group, if he doesn’t exist. - Addbill(groupId, paidBy, amount, split) - For a groupId, assuming only one person can pay the amount, and the split defines the bill split. - GetGroupDebt(groupId) - displays who owes whom and how much.


Question 1: Document version history
• Design a system which will maintain the version history of update.
	○ create document
	○ update document
	○ change version of document
	○ go to a particular version of document
	○ delete a document
	○ Additional Requirement:
		§ user can do operations based on the access given
• You have see question from code-signal test and code in your IDE. Allotted time 2hrs but can take 30mins more, submit the code in zip file over mail.
From <https://leetcode.com/discuss/interview-experience/5706521/PhonePe-or-SDE-or-BLR-or-July'24>

Question 2: Ticket resolution system
Design a PhonePe Resolution Service.
A scenario like there are tickets/issues and there are agents and application
will either assign the ticket to an agent or it will be added to the backlog of an agent.
For matching a ticket with the appropriate agent,
the application can consider the ticket-type and match it with an agent with that speciality.
If no agent with that speciality is found, the ticket can be assigned to any agent or its backlog.
Experience: Had 2.5 hrs to code it on my personal IDE and then send it back to the recruiter over email (after zipping it).
The code was fairly straightforward and be sure to use strategy pattern for the ticket assignment process,
so that the assignment logic is pluggable.
All in-memory data structures were used.
[Word of caution]: Time Management!!
Evaluation of the round happened a couple of days later. It was a 30-min discussion
where I had to discuss about the code and explain the design and implementation choices.
From <https://leetcode.com/discuss/interview-experience/5390347/PhonePe-or-Software-Engineer-or-Bengaluru-or-May-2024-Offer>

• Design a Issue Management System was previously posted on the leetcode interview question discussions
• It had around 5 core requirements and 3 good to have requirements
• I was able to make a working code in 2 hour and submit within the deadline
Took around 1-1.5 weeks for scheduling the Machine Coding Round Review
• The reviewer asked a few questions around LLD design choices
• But it went good and the interviewer was convinced
From <https://leetcode.com/discuss/interview-experience/5151898/PhonePe-Interview-Experience>


Question 3: PhonePe Mini Wallet
Design a prepaid mini wallet for PhonePe through which users can send and receive money among themselves and can win exciting offers. The user can load money into the wallet via. various sources like CC, DC, UPI, etc, and perform easy transactions.
Requirements
	• Users need to register on PhonePe to use this wallet.
	• The minimum amount of transaction will be always greater the 0.
	• The user must have a sufficient balance in his wallet while doing the transaction.
	• The user can fetch their wallet balance.
	• The user can sort transactions history (eg. based on date, amount, etc)
	• The user can filter transactions history (eg. based on user etc)
	• The transactions will be eligible for exciting offers if they meet their respective criteria.
Capabilities
Below are various functions that should be supported with the necessary parameters passed.
These are just suggestions, the signatures can be altered as long as the functionalities are provided.
registerUser - register user to use wallet
topUpWallet() - add money to the wallet
fetchBalance() - fetch balance available in the wallet
sendMoney() - send money to the user, all the eligible offers will be applicable for transaction
get Transactions(filter, sorter) - fetches transactions history based on filter and sorting criteria.
Offers
Following are example offers supported by the wallet
	• The first transaction amounting greater than 100 will be eligible for 10% cash-back
	• If the wallet balance of both the sender and receiver becomes equal after the transaction
Guidelines
	• You should store the data in memory using a language-specific data structure.
	• Implement clear separation between your data layers and service layers.
	• Simple and basic functions are expected as entry point - no marks for providing fancy restful API or framework implementation
	• Because this is a machine coding round, heavy focus would be given on data modelling, code quality etc, candidate should not focus too much time on algo which compromises with implementation time
Expectations:
	• Your code should cover all the mandatory functionalities explained above.
	• The code should be extendable and scalable to incorporate future extensions.
	• Your code should be executable and clean.
	• Your code should be properly refactored, and exceptions should be gracefully handled.
	• Appropriate errors should be displayed on the console
	• Code should be extendable to support multiple offers, filters and sorters
How will you be evaluated?
	• Code Should be working
	• Code readability and testability
	• Separation Of Concerns
	• Abstraction
	• Object-Oriented concepts
	• Exception handling
	• Language proficiency.
	• Scalability
	• Test Coverage (Bonus Points)
	• [execution time limit) 4 seconds (sh)
	• [memory limit) 1 GB
Verdict : Shortlisted for next round as I have implemented design pattern in such a way that the code is scalable.Also, I have implemented the bonus question(offer) in my code too.
https://github.com/shivamrajsr/miniWallet/tree/main/src/main/java/org/example/miniWallet
From <https://leetcode.com/discuss/interview-experience/5143517/Phonepe-or-SDE-11-3-or-Bangalore-or-April-2024-Rejected>



Question 4: We needed to implement a system for managing a hackathon for a college.
* Question can be added into the system of various difficulty and topics
* For each submitted answer different scores are awarded based on difficulty and time taken.
* We need to display the leaderboard for students and also for departments.
* Users can see questions which can be filtered and sorted based on any fields.
Some bonus problems were also there which I didn't solved, but gave the approach for it to the interviewer.
From <https://leetcode.com/discuss/interview-experience/5079215/Phonepeor-Software-Engineer-5-7-or-Bangalore-or-April-2024-Offer>



Question 5: Question was around creating an alert monitoring service
• Component will get alerts from various services in ecosystem and based on rules like sliding window, tumbling window, thresholds, time, etc, we need to trigger some actions like send email, sms, etc
• Expectations were to explain your design (not line by line but an overview). Show them what SOLID and design principles you used and WHY.
• Your code will be tested on extensibility, testability and ease of usage. I was asked to test the code on various test cases given by interviewer and show that test cases were handled. On of my friends was asked to extend the code to adapt new changes. He was tested on the number changes he had to do to accommodate the new changes.
From <https://leetcode.com/discuss/interview-experience/4848227/PhonePe-or-SDE-(3-5yrs)-or-Pune-or-Nov-2023-Offer>



Question 6:
Consider a micro-- env where several systems use 1 central system for all their alert use-cases: Design and implement a system which can capture events generated by any system or user triggered (for simplicity), and raise an alert according to alert configuration.
Type of configurations:
SIMPLE_COUNT (which consists of count)
TUMBLING_WINDOW (which consists of count and windowSizeInSecs, Eg: 10 events in 1 hour-bucket, you can assume that the bucket starts at 00:00 hour of the day)
SLIDING_WINDOW (which consists of count and windowSizeInSecs)
From <https://leetcode.com/discuss/interview-experience/4791656/Phonepe-or-SDE2-or-Pune-India-or-Feb-2024-Reject>



Question 7: TODO
Design a TODO list, with features:
a. Add Task
b. Update Task
c. Remove task
d. Fetch analytics of spilled tasks, completed tasks, etc
Focus on below things -
-Working Executable Code for all functionalities
-Modular and Extensible code following OOPs principles
-Design Patterns
-Concurrency
From <https://leetcode.com/discuss/interview-experience/4088163/Phonepe-or-Software-Engineer-or-Bangalore>



Question 8: Amazon flipkart inventory
https://leetcode.com/discuss/interview-question/3918884/PhonePe-or-Machine-Coding-or-Design-Order-Management-System-like-Flipkart-or-LeetCode-LLD
https://github.com/gaurav-hasiza/lld/tree/main/marketplace_website
Design an Online MarketPlace (similar to Flipkart & Amazon) with functionalities supporting User Login, Adding Product to Market Place. User can add Items to cart, then checkout cart to place Order & also support showing Order History.
I was able to complete the working code.
From <https://leetcode.com/discuss/interview-experience/3605761/Phonepe-Machine-Coding-(-Bad-experience-)>
https://docs.google.com/document/d/1d8GTyPN8OR259esybM0YslHequeNTkoytvio5mnQY20/edit?pli=1#heading=h.gjdgxs
Design a product search for e-commerce platform like in Amazon/Flipkart.
	• Required features:
Create/update/delete category, Create/update/delete products,
Search on basis of any of the product attributes like brand or name or type.
Write test cases with some examples to showcase your implementation.
Object oriented implementation is needed
	• Additional requirements:
Sponsored brands/products should be shown first
	• Duration: 1.5 hr, and separate 15mins round with panel for showing your results & dry run.
	• Main focus was less on how you design the algorithm for search/features rather more on how extendible your code is, so try to complete the code in working condition with appropiate test cases to showcase different requirements
From <https://leetcode.com/discuss/interview-experience/2177661/Phonepe-or-SDE2-or-Bangalore-or-Accepted>



Question 9: Design Google Calendar
I was asked to build a calendar like app where you can add users , add shifts for users and create calendar events for users in system. Implementation of finding suitable slot of user event , listing conflicting events , adding recurring events , etc was also asked.
Focus is more on how clean your code is and whether your implementation Is accurate or not.
1.  Follow best practices like separating models , controllers , services , data store(in memory)
2. comments , method/ variable names
3. use a driver function to show the implementation.
4. all basic scenarios should be working and accurate.
From <https://leetcode.com/discuss/interview-experience/3609494/Phonepe-April-2023>
From <https://leetcode.com/discuss/interview-experience/3651542/PhonePe-or-Software-Engineer-or-Bengaluru-or-Jun-2023-Reject>



Question 10: Similar to In-memory layered cache system. Focus is more on code structure, SOLID principles, test cases, Design patterns.
From <https://leetcode.com/discuss/interview-experience/2614003/PhonePe-or-SSE-or-Bengaluru-or-Aug-or-Offer>



Question 11:Design a Pendency system which should do handle below requirements:
	• Start the tracking of Id which a hierarchy of [instrument, state, city]
	• Stop tracking of Id
	• Count of active Ids in any valid hierarchy e.g. active counts in [UPI, Karnataka] or [UPI]
The latency of Count API had to be as minimal as possible.
Focus is on how the classes are created using OOP Principles. Code should be structured in extensible way for any given scenario. Their main focus was if code reusability, separation of concerns etc. are used.
From <https://leetcode.com/discuss/interview-experience/2616979/PhonePe-SDE-2>
Pedancy System:  https://leetcode.com/discuss/interview-question/2613640/Phonepe-Interview-SSE
From <https://leetcode.com/discuss/interview-experience/3671731/PhonePe-or-Software-Engineeror-Machine-Coding>



Question 12: Problem statement involved designing Car Rental service, with features like:
	• add car to branch
	• allocate price to type of car of that branch. so car types can be SUV, hatchback, sedan, so price of each car tyupe varies from branch to branch.
	• bookCar, so user can book particular car type from a specific branch.
	• view inventory, viewing status of each car and price in each branch.
Time given: 2 hrs, had to pass all required cases mentioned.
We can use any database/ in memory storage, console application/ web application, etc.
From <https://leetcode.com/discuss/interview-experience/2580631/PhonePe-or-Software-Engineer-or-SDE2-or-Bangalore>



Question 13: For this round, the problem statement to was to design an object oriented service for a Movie booking like BookMyShow.
This time I was prepared and able to complete the coding, write test cases and clearly modularise my code into Entity, Service and Repository layer.
The result for this round was also positive.
From <https://leetcode.com/discuss/interview-experience/1830951/Phonepe-or-SE-or-Bangalore-or-March-2022-Offer>



Question 14: Using an n-byte array create an in-memory filesystem that supports:
	○ create_file(filename, content)
	○ read_file(filename)
	○ delete_file(filename)
	○ update_file(filename, content)
• Good to have:
	○ Add content encryption/decryption logic
	○ Handling concurrency
From <https://leetcode.com/discuss/interview-experience/2012467/PhonePe-or-SDE2-or-Bangalore-or-March-2022-or-Reject>



Question 15: Question: Low level Design for cricket dashboard.
Round start with brief introduction and then interviewer asked me to execute and run some tests with multiple scenarios as all the listed functionality were expected to work successfully. After this he asked me to go through the code and explain some sections as the expection was to check the modularised code, LLD, design principal and minimum changes for future feature addition.
From <https://leetcode.com/discuss/interview-experience/2205464/PhonePe-or-Software-Engineer-or-Pune-India-or-March-2022>
-Cricket ScoreBoard Application (can be found in other leetcode posts)
Write a cricket scorecard that will show the score for a team along with score of each player.
You will be given the number of players in each team, the number of overs and their batting
order as input. Then, we can input overs ball by ball with the runs scored on that ball (could be
wide, no ball or a wicket as well).
You are expected to print individual scores, number of balls faced, number of 4s, number of 6s
for all the players from the batting side at the end of every over. You also need to print total
score, total wickets. Essentially, you need to keep a track of all the players, strike changes (at
the end of the over or after taking singles or 3s) and maintain their scores, also keep track of
extra bowls that are being bowled (like wides or no balls). You also need to print which team
won the match at the end
From <https://leetcode.com/discuss/interview-experience/2212456/PhonePe-or-Software-Engineer-or-Pune-India-or-Jun-2022-Offer>



Question 16: Design and implement a Coupon Management System where any distributor can create a batch and ingest coupons into it, and then the system will grant coupons from batch to the user.
Duration: 30 mins Discussion + 90 minutes implementation + 30 mins Evaluation
[ P.S.: Full problem statement and sample solution: Link ]
From <https://leetcode.com/discuss/interview-experience/2579721/PhonePe-or-SDE2-or-Bangalore-or-Accepted>



Question 20: This was a take home assignment was give 24 hrs for completion. Design distributed and concurrent messaging queue. There were 8-10 requirements mentioned.
After this there was 1 hr assignment evaluation after 2 days where we discussed on the implementation, corner cases, enhancements and optimisations in current implementation.
From <https://leetcode.com/discuss/interview-experience/3319647/PhonePe-or-Software-Engineer-or-Pune>



Question 21:Payment Gateway:  https://leetcode.com/discuss/interview-question/object-oriented-design/2771368/PhonePe-or-Machine-Coding-Round-or-Design-Payment-Gateway-or-5-years-exp
Implement a payments gateway which help facilitate a payment for its client, below points should be kept in mind while implementation
**Real world example**
Flipkart has integrated multiple PGs like Razorpay, Citrus, PaySafe, CCAvenue etc. They use these PGs based on different use cases. For example, divert all credit card transaction to RazorPay while Netbanking goes to CCAvenue.
These PGs internally have direct integration with different banks which facilitate the payments.
Expectation from this code is to build PG like a Razorpay / CCAvenue which allows onboarding clients like Flipkart and process a transaction.
*Client* in this case is Flipkart ( PG can have more than one clients )*PG* is what candidate has to implementPG can have more than one *bank*, candidates are free to implement a mock or full fledged class
**Feature Requirement:**
- PG should support onboarding multiple clients.
- PG should have multiple bank integrations ( like HDFC, ICICI, SBI etc )
- PG should have facility to support different payment methods - UPI, Credit / Debit Card, Netbanking etc
- PG should have facility to divert to specific bank based on certain criteria - a router basically - (for e.g. all credit card transaction goes to HDFC and netbanking is redirected to ICICI )
- PG should have facility to allocate specific percentage between different banks - say bank1 takes 30% of total traffic while remaining 70% go to bank2
- Clients should have an option to opt for specific payment methods. - only UPI, everything except netbanking etc



Question 22: Design and implement a restaurant booking system similar to that of Zomato or DineOut
Problem Statement
You need to design a system that allows user to search a restaurant and book a table for n people in a restaurant
There are 3 parts to this problem statement. “registerRestaurant”, “searchRestaurant” and “bookTable”.
Restaurant Booking System:  https://leetcode.com/discuss/interview-question/object-oriented-design/2672043/PhonePe-Machine-Coding-Problem

     */
}
