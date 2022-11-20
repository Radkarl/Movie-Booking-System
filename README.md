# Movie-Booking-System

Suppose that a chain of 6 movie theaters noticed a decline in ticket sales. Their 6 movie theaters
are located in: Lubbock, Amarillo, Levelland, Plainview, Snyder, and Abilene. After surveying
numerous customers, they found that long lines at their ticket booths were causing customers to
choose more convenient means of entertainment. Customers stated that rather than go through
the hassle of waiting in line for 10 minutes, they would rather rent a movie or subscribe to a
movie rental service. After many discussions, the chain’s business analyst recommends a
solution to let customers buy their tickets online(or through a program). By doing so, customers
will be able to either print or display the tickets on their personal devices when entering the
theater. This would save time for customers and costs for the company.
We need to allow customers to buy and print their theater tickets at home with just a few
clicks/selections. Or allow them to show their movie ticket(through a display screen such as a
phone) at the entrance to the theater.
We will design our Movie Booking System(MBS) so that the Americans with Disabilities Act of
1990, and other relevant government regulations such as the FCC are properly adhered to. All
the features of the system described below should not take more than 5 seconds to finish
executing.
Using the MBS, users need to be able to register or log in to the system. During the registration
process, the user provides the necessary details such as name, email address, home address, and
phone number, and creates a password for the platform. Once done, he/she has to enter the
created credential to log in to the system (in this case, email can be the username). During this
registration process, MBS will record the user’s personal details in a database (If you are
unfamiliar with databases, you could save these in a text file).
The homepage or home screen is the main page of the platform that provides users with the
necessary information to navigate to “browse current movie catalog,” “browse upcoming movie
catalog” or “search a movie” pages. On the browse movie catalog page(both upcoming and
currently playing), users will be able to see all movies playing in the theater. Once they find the
movie they like, they will be able to select/click that movie and view more details. The “search
movie” functionality will let you search for movies both currently playing and upcoming.
“Browse upcoming movie catalog” will function similarly to the “browse current movie catalog”
feature. However, users will not be able to purchase tickets in advance for upcoming movies.
Once the user selects the movie(by browsing the current movie catalog, upcoming movie
catalog, or doing a search), he/she will be navigated to another page that gives details about the
movie such as its synopsis, information about the cast, runtime, and reviews.
The ticket booking feature is the most fundamental part of the ticket booking system. The users
can book the ticket by clicking(or selecting from the console window) on the desired movie from
the list. They get to select options such as the time of the show, the theater, and the number of
seats to book. When purchasing, the maximum number of tickets a user can purchase is ten. (To
keep the program simple, we assume each movie theater has unlimited seats and you don’t have
to keep track of the capacity of each room where the movie will be playing.)
Once the user selects the number of seats, the next step is to make the purchase. It is essential to
make sure that the system keeps user information safe. When sensitive pieces of information like
credit card numbers or users’ personal information are involved, the security of the data must be
the prime concern.
Rather than collecting the ticket from the theaters, this feature gives the user tickets in an
electronic form (barcode). As soon as the purchase is made, an electronic ticket is generated,
which can either be printed or displayed on a phone screen. This can be scanned upon their
arrival at the theater. This feature can save a lot of time for both users as well as the
theaters. Tickets purchased by a user will have a special barcode (in your case, you may display
a unique number instead of a barcode). The system you design should only accommodate credit,
debit, or PayPal as its payment methods.
The movie booking system(MBS) should also allow users to write movie reviews. The review
feature simply allows the users to share their experiences in the comment section, just below
every movie description. This feature is also useful for other users. They can read reviews before
making a purchasing decision.
If the person that logs in is an administrator(admin), he/she will have access to a different set of
functionalities. An admin page should have a way to retrieve the current status of the
system. This status report should include things like how many tickets have been sold and what
movies are playing.
Admins should also have a “manage show” feature. This feature allows the admin to view, add,
and remove shows on the platform. They should also be able to add details of the show such as
the time, and the prices of the tickets.
To keep the project simple, we assume this system doesn’t have the following features:
• Users can’t do guest checkout; they must register in order to use this system.
• Users can’t do a preferred seat selection through the app.
• No movie trailers will be shown in the app.
• No rewards program is associated with this system.
• We are not concerned with the user’s location.
• Rating will not be recorded for movies (only user reviews).
• No push notifications.
• This system is not connected to the concession stand.
