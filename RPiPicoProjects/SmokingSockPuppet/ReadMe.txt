Hi all!

Here is where im posting updates on my smoking sock puppet project. I'm very excited because this project 
merges my art practice and my computer science training (into something riddiculous that the world neither
needs nor wants)! By November 29 I'll have a sock puppet on a pedestal that is able to smoke cigarettes on its own
(provided I put them in its mouth)

Update #1 (10/28/23)
  My components came in the mail! Right now I am working with a Raspberry Pi Pico, a TB6600 chopper driver, 
  a nema 17 stepper motor, a small fireplace bellows, some 1/2 in tubing and an M8 threaded rod and wingnuts.
  all of this together should be enough to create my puppet's "lungs". 

Update #2 (11/1/23)
  My initial enthusiasm has given way to some frustration as I'm finding out that "bit banging" may be the only
  way to get my motor to move with my current hardware setup. 

Update #3 (11/2/23) 
  I found a package  in the PyPi repository that looks like it will solve all of my problems.

Update #4 (11/2/23)
  it did not solve any of my problems.

Update #5 (11/5/23)
  I downloaded an older version of Thonny and now the package finally runs on my computer! Marcus should be up
  to a pack a day in no time!

Update #6 (11/11/23)
  the stepper motor still isn't moving. I've narrowed down the source of my problems
  Its either:
      - a dud motor
      - a dud driver
      - my power supply (8 AA batteries) is insufficient
      - My code doesnt work
   On a positive note, I found the perfect white tube sock with red stripes. A classic.
   
Update #7 (11/15/23)
  Made the structure for the sock out of paper mache and my left arm. Note for next time: dont do this less 
  than 4 hours before you have class.

Update #8 (11/18/23)
  Found a DC power source to test whether my power supply was the problem. Motor still wont move. Downloaded
  Arduino IDE because most code I found online is for Arduino. Unfortunately it doesnt exactly translate to
  a Pico. 

  Ordered a new motor and driver to test whether those are the problem. In a moment of weakness I also 
  ordered an Arduino Uno. Lets hope the built in stepper functions make my life easier!


