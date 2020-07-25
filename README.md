# ViewModelsDemo
A small demonstration application for showing the power of view models and data binding

## Data binding with View Models
Here's an example of binding things with view models. 
Assume you have a text view, edit text. What we'll achieve is, when you type something, the text view will display the text taken from the edit text, simultaneously. 

The main databinding is happening in your layout xml file, [here](https://github.com/KhyatiMehta3/ViewModelsDemo/blob/0af258ee58e10870fd84291f9089b08bd70c1cb3/app/src/main/res/layout/activity_main.xml#L21) & [here](https://github.com/KhyatiMehta3/ViewModelsDemo/blob/0af258ee58e10870fd84291f9089b08bd70c1cb3/app/src/main/res/layout/activity_main.xml#L31). 

In your view model, the same string is actually a mutable Live data of type String. Which basically means that the String value can be added to that live data and also be read from that live data. [Here](https://github.com/KhyatiMehta3/ViewModelsDemo/blob/0af258ee58e10870fd84291f9089b08bd70c1cb3/app/src/main/java/com/example/databindingsample/MainActivityViewModel.java#L11) we are initializing it. 

The [`setupBinding()`](https://github.com/KhyatiMehta3/ViewModelsDemo/blob/0af258ee58e10870fd84291f9089b08bd70c1cb3/app/src/main/java/com/example/databindingsample/MainActivity.java#L19) function takes care of linking our view model, the activity and the layout together. The best part is that the these view models are aware of lifecycle of the activity so after typing, if you rotated the device for example, it wouldn't affect the user interface. It will persist that. 
This is the main reason of using view models. 
