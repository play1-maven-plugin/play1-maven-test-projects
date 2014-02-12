I. Running "main-app" application with classes from both modules ("main-app" and "dep-module")
   without installing (mvn install) "dep-module" first. WITHOUT hot-reloading!
   This method is simple, but works only if there is only one Play! application in the reactor.

  1. Inter-module dependencies configuration.

    Nothing required


  2. Running main-app.

    mvn compile play:run


II. Running "main-app" application with classes from both modules ("main-app" and "dep-module")
    with installing (mvn install) "dep-module" first. WITHOUT hot-reloading!
    More complicated, does not make sense to use this method, unless there are many Play! apps
    in the reactor..

  1. Installing parent and "dep-module" modules.

    mvn install --projects .,dep-module

    or

    mvn install -N
    cd dep-module
    mvn install
    cd ..


  2. Running "main-app".

    2a. Running "main-app" for the first time (or after every "mvn clean").

      mvn initialize play:run

      or

      mvn initialize play:run --projects main-app

      or

      cd main-app
      mvn initialize play:run


    2b. Running "main-app" after it has been initialized.

      mvn play:run

      or

      mvn play:run --projects main-app

      or

      cd main-app
      mvn play:run
