# ANDROID_CallIntent

Intent
-----------
An Intent provides a facility for performing late runtime binding between the code in different applications. Its most significant use is in the launching of activities, where it can be thought of as the glue between activities. It is basically a passive data structure holding an abstract description of an action to be performed.

Explicit Intent
----------- 
Explicit intents specify which application will satisfy the intent, by supplying either the target app's package name or a fully-qualified component class name. You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start. For example, you might start a new activity within your app in response to a user action, or start a service to download a file in the background.

Implicit  Intent
-----------
Implicit intents do not name a specific component, but instead declare a general action to perform, which allows a component from another app to handle it. For example, if you want to show the user a location on a map, you can use an implicit intent to request that another capable app show a specified location on a map.


ScreenShots
-----------
<div>
<img width="200" src="https://user-images.githubusercontent.com/32612534/40548110-17c73aea-6034-11e8-9b37-269a355e124d.png">
<img width="200" src="https://user-images.githubusercontent.com/32612534/40548114-18e1a79e-6034-11e8-8d14-69bd4934ed5e.png">
<img width="200" src="https://user-images.githubusercontent.com/32612534/40548115-1943b81c-6034-11e8-8195-991d8fdc6392.png">
</div>

