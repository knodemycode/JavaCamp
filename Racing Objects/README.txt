Racing Objects 1.0

1. Open Student.java. This is your workspace. 

2. Construct some of the following objects:

RACING MAPS (PICK ONE)
	- RaceTrack —> 	constructor: RaceTrack()
	- AnimalFarm -> constructor: AnimalFarm()

RACERS (PICK ONE)
	- Racer -> 		constructor: Racer(RaceTrack r)
	- Car -> 		constructor: Car(RaceTrack r)
	- CustomCarSample -> 	constructor: CustomCarSample(RaceTrack r)
	- Chicken -> 		constructor: Chicken(RaceTrack r)

Example of constructing an object:
Object objectName = new constructor(parameters);

RaceTrack r = new RaceTrack();
Racer mario = new Racer(r);

3. Modify objects. 
	a. Look at Racer.java and RaceTrack.java. 
	In there you will see several methods. Read what they do. 

	b. Look at Car.java and AnimalFarm.java. 
	These are examples of modified objects that inherit some properties from Racer.java and RaceTrack.java

	c. Override methods!

4. Create some of your own objects! Don’t forget to inherit (extends) from Racer if you want your object to race on the raceTrack. 