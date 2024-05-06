**Date: 01/05/2024**

**Product Name: My Tamagotchi Pet**

**Author: Gwendelynn Tharratt**

**Student Number: ST10452535**

**Module: IMAD5112A1**

# **Purpose of Application**

My Tamagotchi Pet Application was developed to replicate the 1996
Tamagotchi Egg toy that was first released in Bandai in Japan on 23
November 1996 (Andersen, 2021). This little toy had a 32x16 pixel screen
where the little digital pet could be seen on, as well as 3 little
buttons to be used to take care of the pet (Andersen, 2021). Just like
the toy egg, this application was developed to be used by children but
it’s not limited as the public can also use it.

![home](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/6adbc240-1096-47ab-9a88-4d904d5b8d6e)

Figure 1:Welcome Page Background (Canva, 2024)

![clean](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/504619e0-c7c7-4b07-a296-46bff52472c2)

Figure 2: PLAY Page Background (Canva, 2024)

According to Anderson (2021) it was said “while the toy pretty much
disappeared from the schoolyards these days – replaced by smartphones…”.
Thus, this application is to be used on smartphones on Android. The
application is solely for entertainment purposes where users can feed,
clean and play with their digital pet, monitoring the digital pet’s
health, cleanliness and hunger status through the status bars.

In the application the user will enter the application and will be
presented with a welcome page, where the user will need to press the
“PLAY” button to continue to the next page. On the page the user will do
as previously mentioned above, where the user can feed, play and clean
the virtual pet by a press of a button. The image of the pet will change
accordingly with the action.

![Picture1](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/171b2fdf-6b77-419a-aa9b-f1cfedfded54)

As status bars will also increase at the same time, to visually
represent the status of the pet’s health, hunger and cleanliness, but
there should also be noted the status decreases over time to simulate
the pet’s needs and conditions.

In this application there is the aspect which teach children how to take
care of the virtual pet, just like taking care of a real pet to develop
the sense of responsibility in children through the use of the
application or game. As the goals of the application are simple enough
for children to achieve and just maintain the virtual pet’s health and
wellbeing.

The application is a new way to take an old vintage toy and recreate it
to be innovative and to be used by all in the 21’st century by all that
have smartphones.

![Original Tamagotchi - Pink Glitter](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/d46389b4-39d1-4b28-bcdf-a77e73ab4953)

# **Design Consideration**

As this application has **two pages**.

![Screenshot 2024-05-06 180418](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/57948900-0fb4-4b93-96aa-6477cb2f2e3a)  
*This is the Main Activity Window*

![Screenshot 2024-05-06 180628](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/a5e0fcb3-4126-4766-880e-ae49086745ac)  
*This is the Play Activity Window*

When designing and developing this application it was all done in the
Android Studio Iguana | 2023.2.1. When developing the coding language
was Kotlin. The coding emulator specification was set as:

*Pixel 2 API 26*

*Android 8.0 (“Oreo”) | x86*

![Picture2](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/e5dec3e5-a58b-461e-ac60-b94972e913a1)

## <u>Intuitive Design</u>

This design was inspired by the small Tamagotchi toy egg. In my version
of the application, I used a Dalmatian as my virtual pet, and to
incorporate colour, I used pastel colours and soft fonts that are easily
readable. I designed the background for both of the pages myself and
used online images to incorporate the actions of my virtual pet. I
included essential placement blocks to indicate where other elements
will go. My design is easy to understand because it adheres to logical
steps. On the first page there is a welcome message to the user that
introduces the virtual pet, then a PLAY button.

It will then lead to the second page; where three buttons are placed
(Feed, Clean, Play), these are seen as an input to the ImageView (that
displays the corresponding action to the button) and to the TextViews
(where the statuses of the virtual pet are displayed and increases by
each press of the corresponding button).

### ***Welcoming Page***

- There are two text views for the welcoming title “Welcome to Dolly
  your ….”

  - This simply shows the welcome message of the app without any
    additional functionality. The font is set to Amaranth with a font
    size of 24sp and is Bold.

  - The welcoming title is coloured Hot Pink - \#FFAEBC

  - This will catch the user’s attention when running the app.

- Button “btnPlay”

  - In this element is in the font Alfa Slab One, with a font size of
    20sp. The colour of the button is also Hot Pink, which make this
    button noticeable. Although the background colour of the application
    was made a shade lighter to this one to increase accessibility for
    users.

  - When this button is pressed, it will then navigate to the second
    page of the application; “Play page”

### ***Play Page*** 

- Image View “dogImageView”

  - This element is perfectly sized to display the images of the virtual
    pet. The element was coded to change when a button is clicked to a
    corresponding image that is in an array. The background of the
    images was made colorful so the images could easily be told apart
    from the page background.

  - The images are stored under the *drawable* folder in the code.

- Button “btnFeed”

  - This button has the font of Alfa Slab One, with the font size to
    20sp. The colour of the button was made Tiffany Blue - \#A0E7E5.

  - The colour was changed to make it noticeable to tell apart from the
    other buttons.

  - When this button is pressed it will change the image in the
    ImageView to the corresponding image (feed.png) and also update the
    status by 5 in txtHunger.

- Button “btnClean”

  - This button has the font of Alfa Slab One, with the font size to
    20sp. The colour of the button was made Mint - \#B4F8C8.

  - The colour was changed to make it noticeable to tell apart from the
    other buttons.

  - When this button is pressed it will change the image in the
    ImageView to the corresponding image (clean_1.png) and also update
    the status by 5 in txtCleanliness.

- Button “btnPlay”

  - This button has the font of Alfa Slab One, with the font size to
    20sp. The colour of the button was made Yellow - \#FBE7C6.

  - The colour was changed to make it noticeable to tell apart from the
    other buttons.

  - When this button is pressed it will change the image in the
    ImageView to the corresponding image (play.png) and also update the
    status by 5 in txtHealth.

  - Although it has the same id as the Welcome Page button, this one is
    used in another activity.

- There are three text boxes for the status updates, it all display in
  the same font and it bold:

  - txtHunger – to show the updated status of the hunger of the pet by
    5.

  - txtCleanliness – to show the status of how clean the virtual pet is.

  - txtHealth – to show the status of how in good physical health the
    pet is by playing with the virtual pet.

## <u>Content Prioritization</u>

I made sure to add the required component:

TextView1

TextView2

Button btnPlay (to continue to second page)

![Screenshot 2024-05-06 180700](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/596d4aac-0336-422f-8836-41dc9620e7c7)

ImageView dogImageView (display images when corresponding button
clicked)

Button btnFeed (update txtHunger status & change image)

Button btnClean (update txtCleanliness status & change image)

Button btnPlay (update txtHealth status & change image)

TextView txtHunger

TextView txtCleanliness

TextView txtHealth

![Screenshot 2024-05-06 180723](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/24516196-4968-44d7-883c-457f24274e79)

## <u>Legible Text Content</u>

Fonts used: Amaranth / Alfa Slab One

Font size: 24sp / 20sp

Button Colours: Hot Pink – \#FFAEBC

Tiffany Blue – \#A0E7E5

Mint – \#B4F8C8

Yellow – \#FBE7C6

Through the emulator the font and font size display perfectly.

## <u>Make Interface Element Clearly Visible</u>

On the emulator screen, the spacing was tested until it was just right.

## <u>Hand Position Controls</u>

The buttons will be easily accessible to the user. The button's size
enhances user accessibility and promotes efficient use of the
application.

## <u>Emulator Example:</u>

Step 1: When running the app on the emulator, it will open on the
Welcome Page. Where a message will be displayed.

![Screenshot 2024-05-06 180953](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/1cfb2e8b-3393-406c-80d5-963b8e6a129a)

Step 2: The user will then be able to press the “PLAY” button, to
continue on to the next page.

Step 3: The user will then be presented by the play page.

![Screenshot 2024-05-06 181019](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/4d409ec4-ea39-4bb0-96e3-6ff06da1430e)

Step 4: The user will then press the “Feed” button as a way of input.

Step 5: The UI will communicate with the code, to retrieve instructions
on what to do.

Step 6: The image in the dogImageView will change to one of a “Dog
Eating”, and at the same time the status next to Hunger will increase by
5 in the txtHunger status bar to showcase the dog has been fed.

![Screenshot 2024-05-06 181039](https://github.com/ST10452535/My-Tamagotchi-Pet-Assignment-2/assets/160850866/6aca1c6f-b2c6-457a-8e0b-c4ca9ea525e1)

Step 7: The user will be able to press the back button to back to the
Welcoming Page or Exit the application.

# **GitHub Utilization**

As we needed to push our code to GitHub follow the steps of:

1.  Make a repository, which is initialized with a README file.

2.  Then pushing my Android Application from Android studio to GitHub,
    through the file management. Opening the application file

    1.  At the top where path is show, click file, type CMD

    2.  git init

    3.  git add .

    4.  git commit -m “first commit”

    5.  git branch -M main

    6.  git remote add origin **repository URL**

    7.  git push -u origin main

As seen, I did push my application file to the main branch. I did push
successfully.

## <u>GitHub Actions</u>

Testing was carried out manually in Android Studio. The workflows were
established.

- In order to verify the functionality of the application.

- In order to construct the application.

The codes are located in the workflows folder of the main branch on the
GitHub repository.

# **YouTube Link**

Please follow the link: https://youtu.be/rN2sMcbsYlU

# **Reference List:**

Tamagotchi Store. 2024. Tamagotchi Original - Pink Glitter. \[Online\].
Available at:
<https://www.amazon.com/Tamagotchi-42882-Original-Pink-Glitter/dp/B08XWPTTDN/ref=asc_df_B08XWPTTDN?tag=ushpadpinde-20&hvdev=c&psc=1&pp=1>
. \[Accessed 1 May 2024\].

IIE. 2024. Introduction to Mobile Application Development. Pretoria. IIE

Teddy. 2024. Light pink paper texture background, design space.
\[Online\]. Available at:
<https://www.rawpixel.com/image/3933832/light-pink-paper-texture-background-design-space>
\[Accessed 26 April 2024\].

Patchakorn Phom-in. 2019. Cute background Abstract Color Pastel Dot
shape Pattern. \[Online\]. Available at:
<https://www.alamy.com/cute-background-abstract-color-pastel-dot-shape-pattern-image223863397.html>
\[Accessed 26 April 2024\].

Lively. 2024. Cartoon dog with black spots sitting on white background
generative ai. \[Online\]. Available at:
<https://www.freepik.com/premium-ai-image/cartoon-dog-with-black-spots-sitting-white-background-generative-ai_83930622.htm>
\[Accessed 26 April 2024\].

evet. 2024. Dalmatian Dog - Cartoon Love. \[Online\]. Available at:
<https://www.cleanpng.com/png-dalmatian-dog-cruella-de-vil-the-101-dalmatians-mu-2538780/>
\[Accessed 26 April 2024\].

pngegg. 2024. Dalmatian dog Puppy Dog grooming Bathing Animation,
bathtub, furniture, food png. \[Online\]. Available at:
<https://www.pngegg.com/en/png-ygigl> \[Accessed 26 April 2024\].

pngwing. 2024. Dalmatian dog The 101 Dalmatians Musical Puppy Rolly,
dalmatians, white, mammal, animals png. \[Online\]. Available at:
<https://www.pngwing.com/en/free-png-npjki> \[Accessed 26 April 2024\].

Canva. 2024. Tamagotchi Background. 26 April 2024. \[Online\]. Available
at:
<https://www.canva.com/design/DAGDJAWwXtw/HCZkCNeoHm0-VfqN-frQkw/edit?utm_content=DAGDJAWwXtw&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton>
\[Accessed 26 April 2024\].

Bradley St John Jones. 2014. How would I make an Image Array?, Kotlin.
\[Online\] .  
Available at:
<https://teamtreehouse.com/community/how-would-i-make-an-image-array>  
\[Accessed 27 April 2024\]

OpenAI. 2024. Chat-GPT (Version 3.5). \[Large language model\] .  
Available at: <https://chat.openai.com/>  
\[Accessed 27 April 2024\]

The Shiva. 2018. What to do to increment by 2 instead of 1?, Java.
\[Online\] .  
Available at:
<https://www.sololearn.com/en/Discuss/1492044/what-to-do-to-increment-by-2-instead-of-1->  
\[Accessed 27 April 2024\]

Canva. 2024. IMAD Doggies, 26 April 2024. \[Online\]. Available at:
<https://www.canva.com/design/DAGDJjED6fc/xIH7UgC3TPpRkOyPePwvfg/edit?utm_content=DAGDJjED6fc&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton>
\[Accessed 27 April 2024\].

Samsilversmith. 2024. Peachy Tamagotchi Art Print. \[Online\]. Available
at:
[https://society6.com/product/peachy-tamagotchi_print](https://society6.com/product/peachy-tamagotchi_print%2026)
. \[26 April 2024\]

Canva. 2024. Assignment 2, 26 April 2024. \[Online\]. Available at:
<https://www.canva.com/design/DAGDJ48DLjs/DrAvw9N2gBMHQeTkhOYftQ/edit?utm_content=DAGDJ48DLjs&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton>
\[Accessed 27 April 2024\].

## ***<u>Extra Resources:</u>***

Medium. 2023. Nurturing Digital Companions: Building a Tamagotchi Game
in Kotlin. 13 June 2023. \[Online\]. Available at:
<https://knapsson.medium.com/nurturing-digital-companions-building-a-tamagotchi-game-in-kotlin-6f58552ba2e7>
. \[Accessed 27 April 2024\].

Tamagotchi Classic IOS/android app. 2015. YouTube. Available at:
<https://www.youtube.com/watch?v=xMjukrY8l68> \[Accessed: 01 May 2024\].

***<u>Research:</u>***

Neko Atsume - <https://www.nekoatsume.com/en/>

Dogotchi: Virtual Pet - <https://www.youtube.com/watch?v=Bde6LLfdkfw>
