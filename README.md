#PairAndroid
Pair programming for Android candidates

### Environment Setup
For this you will need:

1. Android Studio 1.+
3. Android SDK for 5.0.1+ (API 21)
2. A handset virtual machine with Lollipop (API 21) installed.
We recommend one based on the Nexus 6.
3. A tablet virtual machine with Lollipop (API 21) installed.
We recommend one base on the Nexus 9.
3. Clone this repository and make a branch for your changes.

### Instructions

All tasks in the pair depend on the previous one, so you will have to finish the
first one before going to the next one.

To complete the pair you can use anything available in the Android SDK 
(except for deprecated stuff) and support libraries. You can use **public** available
libraries too, except for the Instagram Android SDK (we don't want to it to be THAT easy).
**_Bag of tricks_** type of libraries are prohibited too.

**The application must not crash and be responsive to input from the user anytime.**

For this pair we look for strong candidates with knowledge on the Android platform,
even if the exercises are not strong on computer science stuff, we will be looking
 at that kind of abilities.

Nearsoftnians are here to help, if you have any questions shoot them with one. They may
not know the precise answer but they will be happy to assist you. Team work is a strong
value to have in our company.

**The application must not crash and be responsive to input from the user anytime.**

Lets get it started... good luck!

## MVP

Create a new project or use the one we provide is up to you to decide. This project must 
have an activity that show photos from an Instagram feed. We recommend to use this one: https://api.instagram.com/v1/media/popular?client_id=f7373613c193424ba4be7f85ec6e6b2c.

1. Photos must be displayed on a list. 
2. Each photo must include an excerpt of the caption text and the uploader's name.
3. The application must be compatible with API 15 and higher.
4. The aplication must not crash and be responsive to user's input at anytime.
5. There must be no deprecated calls in code.

**EXTRA POINTS: If you make the list endless.**

**EXTRA POINTS: If you make the list like a grid.**

## We need to go further

Create a new activity that will show detail information about the selected photo.

1. You must show the caption of the photo, the author's name and avatar, the number of likes, and at least
5 comments if the photo have any.
2. You have to create a custom layout for tablets, look at the blueprints bellow.

**EXTRA POINTS: If you make photos swipeable, this means you can swipe between photos in the list.**

### Handset layout
```
-------------------------
|                       |
|                       |
|         PHOTO         |
|                       |
|               # LIKES |
|-----------------------|
| Author's data & pic   |
|                       |
| Caption text          |
|                       |
| Comments              |
|                       |
|                       |
|                       |
|                       |
|                       |
-------------------------
```


### Tablet layout
```
-------------------------------------------------
|                       |                       |
|                       | Author's data & pic   |
|                       |                       |
|                       | Caption tex           |
|                       |                       |
|         PHOTO         | Comments              |
|                       |                       |
|                       |                       |
|                       |                       |
|                       |                       |
|                       |                       |
|                       |                       |
|               # LIKES |                       |
-------------------------------------------------
```
