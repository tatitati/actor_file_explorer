## Setup

```
sbt compile
```

## execute example

```
# How many files are in the folder? (with concurrent actors)
sbt "run /Users/tati/Desktop/scala_lab/counter_files"
```



Output:
```
......
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/project/target/scala-2.12/sbt-1.0/resolution-cache/default/counter_files-build/scala_2.12: 0
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/project/target/streams/$global/update/$global/streams/update_cache_2.12: 2
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/target/streams/$global/dependencyPositions/$global/streams/update_cache_2.12: 2

Files count: 190
```

Manual test:

```
find /Users/tati/Desktop/scala_lab/counter_files -type f | wc -l                                                                                                                                
     190
```
