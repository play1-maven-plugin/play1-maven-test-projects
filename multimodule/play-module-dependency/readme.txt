I. Running "main-app" application with classes from both modules ("main-app" and "dep-module")
   without installing (mvn install) "dep-module" first. WITH hot-reloading!
   This method is simple, but works only if there is only one Play! application in the reactor.

  1. Inter-module dependencies configuration.

    mvn initialize play:dependencies

    or

    mvn initialize -Pautodeps


    You should see:

    [INFO] Play! module dependency found in reactor, relative path is "../dep-module"

    output when executing play:dependencies goal for "main-app" module.


  2. Running main-app

    mvn play:run


II. Running "main-app" application with classes from both modules ("main-app" and "dep-module")
    with installing (mvn install) "dep-module" first. WITH hot-reloading!
    More complicated, does not make sense to use this method, unless there are many Play! apps
    in the reactor.

  1. Installing parent and "dep-module" modules.

    mvn install --projects .,dep-module

    or

    mvn install -N
    cd dep-module
    mvn install
    cd ..


  2. Running "main-app".

    2a. Running "main-app" for the first time (or after every "mvn clean").

      mvn initialize play:run --projects main-app

      or

      cd main-app
      mvn initialize play:run


    2b. Running "main-app" after it has been initialized.

      mvn play:run --projects main-app

      or

      cd main-app
      mvn play:run



III. Testing if hot reloading works.

  Change value returned by getMessage() function of utils.Util class in "dep-module" module
  and reload application.
