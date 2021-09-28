# Lab03 - Linter Application for javascript files:

## Behaviour:
This application reads a javascript file , and checking if the file contains an error, it will print "Missing semicolon." with the line number instead of the line content.

The application will not show error in these cases:

  * Won’t show an error if the line is empty.
  * Won’t show an error if the line ends with an opening curly brace '{'.
  * Won’t show an error if the line ends with a closing curly brace '}'.
  * Won’t show an error if the line contains if or else.