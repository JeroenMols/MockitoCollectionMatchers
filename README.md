# MockitoCollectionMatchers
Extension of Mockito that provides easy to use matchers for Collections such as Lists, Sets,...

Simplify your unit tests from:

```java
@Test
public void sendMessage() throws Exception {
    User user = new User(mockWebService, USER_ID, PASSWORD);
    ArgumentCaptor<List<String>> listArgumentCaptor = ArgumentCaptor.forClass(List.class);
    String expectedMessage = "Test message";

    user.sendMessage(expectedMessage);

    verify(mockWebService).sendMessages(eq(user), listArgumentCaptor.capture());
    List<String> messages = listArgumentCaptor.getValue();
    String actualMessage = messages.get(0);

    assertEquals(expectedMessage, actualMessage);
}
```

to:

```java
@Test
public void customMatchers() throws Exception {
    User user = new User(mockWebService, USER_ID, PASSWORD);
    String expectedMessage = "Test message";
    user.sendMessage(expectedMessage);

    verify(mockWebService).sendMessages(listContains(expectedMessage));
}
```

## Features
```java
verify(mock).someMethod(listContains(expectedObject));
verify(mock).someMethod(listContains(expectedObject, index));
verify(mock).someMethod(listDoesNotContain(wrongObject));
verify(mock).someMethod(listDoesNotContain(wrongObject, index));
verify(mock).someMethod(listOfSize(3));

verify(mock).someMethod(setContains(expectedObject));
```

## How to use

1) Add the Jitpack repository to your project:
```groovy
          repositories {
              maven { url "https://jitpack.io" }
          }
```
2) Add a dependency on the library:
```groovy
          testCompile 'com.github.JeroenMols:MockitoCollectionMatchers:0.0.2'
```

## TODO
* Add unit tests
* Add more matchers
* Support other collections
* Add CI
* Add code coverage
* Upload to JCenter

## Questions
[@molsjeroen](https://twitter.com/molsjeroen)
