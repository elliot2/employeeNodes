# Code Excercise

Below is employee data of a small company.
It represents the hierarchical relationship among employees. CEO of the company doesn't
have a manager.

Employee table

| Name        | id           | Manager id  |
| ------------- |:-------------:| -----:|
Alan|100|150
Martin|220|100
Jamie|150
Alex|275|100
Steve|400|150
David|190|400

## Acceptance Criteria

Design a suitable representation of this data. Feel free to choose any database (RDBMS, in-
memory database etc), file system or even a data structure like List or Map. Then write code

(in any language and framework) that displays the organisation hierarchy as below:

||||
| ------------- |:-------------:| -----:|
| Jamie | | |
| | Alan | |
| | | Matin |
| | | Alex |
| | Steve | |
| | | David |

The result can be simply displayed on the console.

## Technical notes

### Build

```
gradlew build
```

### Test

```
gradlew test
```

### Run

```
gradlew run

> Task :run
Jamie
    Alan
        Martin
        Alex
    Steve
        David

BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```
