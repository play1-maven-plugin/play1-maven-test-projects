'crud' module NOT defined in 'conf/application.conf' file, only as a dependency
('conf/dependencies.yml' for Play!, 'pom.xml' for Maven)

run "mvn clean play:dependencies package" or "mvn clean play:dependencies package -Dplay.home=/path/to/play-1.2.3"
