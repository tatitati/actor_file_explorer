## Setup

```
sbt compile
```

## execute example

```
sbt "run /Users/tati/Desktop/scala_lab/counter_files"
```



Output:
```
......
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/target/streams/compile/externalDependencyClasspath/$global/streams: 1
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/target/streams/compile/compileIncSetup/$global/streams: 1
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/target/streams/compile/internalDependencyClasspath/$global/streams: 1
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called
counting files in folder: /Users/tati/Desktop/scala_lab/counter_files/project/target/streams/$global/update/$global/streams/update_cache_2.12: 2
FilesCounterInSubfolderFolderActor::postStop called
Files count: 223
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called
FilesCounterInSubfolderFolderActor::postStop called

Files count: 223
```

Manual test:

```
find /Users/tati/Desktop/scala_lab/counter_files -type f | wc -l                                                                                                                                
     223
```
