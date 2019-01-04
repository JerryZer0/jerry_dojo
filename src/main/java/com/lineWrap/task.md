- case 1
```text
//given
string="apple" length=6
//when
call wrapLine
//then
return "apple"
```

- case 2
```text
//given
string="go to school" length=6
//when
call wrapLine
//then
return "go to \nschool"
```

- case 3
```text
//given
string="go to school" length=8
//when
call wrapLine
//then
return "go to   \nschool"
```

- case 4
```text
//given
string="apple" length=3
//when
call wrapLine
//then
throw exception
```

