Running "main-app" application with hot-reloading for classes from both modules ("main-app" and "dep-module").

1. Because of some strange problem with Maven dependency resolution with custom packagings:
run "mvn --file dep-module/pom.xml install" ONCE

2.
mvn play:dependencies

3.
mvn play:run --projects main-app

or

cd main-app
mvn play:run

