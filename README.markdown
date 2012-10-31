GreenDroidLight
===============

This project is based on the project Greendroid (https://github.com/cyrilmottier/GreenDroid).
This version offers a lighter version of the original library. The main changes are :

1. Remove all the code corresponding to ActionBar as it was conflicting with the SDK implementation starting with HoneyComb. You can check [ActionBarSherlock](http://actionbarsherlock.com/) for a support of the ActionBar pattern instead.
2. Modify some constraints of the original library.


How to use GreenDroidLight in your project
------------------------------------------

In order to use GreenDroidLight in your project you have to do the following steps :

1. Download the current version of the GreenDroidLight project on your computer using git (`git clone git@github.com:foxykeep/GreenDroidLight.git`).
2. Import the project GreenDroidLight in your Eclipse workspace.
3. Add the library to your project using the Android Library Projects feature in the ADT plugin. More information in the [Android documentation website](http://developer.android.com/guide/developing/projects/projects-eclipse.html#ReferencingLibraryProject)
4. If you want to use the AsyncImageView, create a custom Application in your project and have it implement the GDApplicationInterface interface. You can check the GreenDroidLightPoC folder for an example project. 


Software Requirements
---------------------

GreenDroidLight has been developed for Android 1.6 and greater.


Credits and License
-------------------

Foxykeep ([http://www.foxykeep.com](http://www.foxykeep.com/))

As all my project, I would have released under the Beerware License (More info : http://en.wikipedia.org/wiki/Beerware) but it's not my project to begin with so here is the information about the original project and its license :

GreenDroid by Cyril Mottier (http://www.cyrilmottier.com)

Licensed under the Apache License, Version 2.0 (the "License");
You may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License

