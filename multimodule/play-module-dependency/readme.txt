Running "main-app" application with hot-reloading for classes from both modules ("main-app" and "dep-module").

1. Inter-module dependencies configuration. Follow these instructions to do it properly.

mvn play:dependencies compile

or

mvn compile -Pautodeps


You should see:

[INFO] Play! module dependency found in reactor, relative path is "../dep-module"

output when executing play:dependencies goal for "main-app" module.


2. Running main-app

mvn compile play:run


3. Testing if hot reloading works

Change value returned by getMessage() function of utils.Util class in "dep-module" module
and reload application.



P.S.
Maven "compile" phase executed for "dep-module" module before anything is executed for "main-app" module
is required for proper "main-app" module Maven dependency resolution without installing "dep-module" module
to local repository first.