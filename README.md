#Test Driven Development

Did I mention that I had a programmer's crush on Kent Beck? The coolest thing that Beck did in my opinion is test driven development and Beck has done some pretty cool things with software methods. The thing that I love about test driven development (TDD) is that it helps get past procrastination. I am not saying that all software people are procrastinators, but we probably all know someone that is. TDD helps get past procrastination by taking a big overwhelming task like writing a new software system into a series of littler tasks that start at an easy starting point. Write a failing test.

In Java, I can start a new system with a test as simply as typing this at the command line:

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

OK ... so maybe that part wasn't real simple, but now you have a project that you can open in your favourite IDE. In class we used Android Studio, as we had already used Android studio when getting our [greenfoot scenarios to run on an android device](https://github.com/rhildred/droidfoot). To open the newly created project in Android studio, you can use:

![Import](https://rhildred.github.io/tddjunit/READMEImages/AndroidStudioStart.png "Import")

Once in Android studio you can explore the project structure, which will look something like this:

![Structure](https://rhildred.github.io/tddjunit/READMEImages/folderStructure.png "Structure")

Right mousing over the AppTest object will run the unit tests in that folder. Maven scaffolds one for you that looks like this:

```
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

```

In our case the unit under test (UUT) was a class that calculates provincial salestax (HST in Ontario). The unit under test is added to the scaffolded structure here:

![UUT](https://rhildred.github.io/tddjunit/READMEImages/UUT.png "UUT")

The developer proceeds to write a real test like:

```
    public void testHSTCalculateON()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "ON").compareTo(new BigDecimal("11.3")) == 0);

    }

```

They run the test, making sure that it fails. They then code the code that implements a passing test, run the tests all again and if all is well, the tests will all pass this time:

```
        }else if(sProv.equals("ON") ||
                sProv.equals("NB") ||
                sProv.equals("MB") ||
                sProv.equals("NL")){
            return (new BigDecimal("1.13").multiply(nIn));

```
Perhaps my example is a little more underwhelming than overwhelming, but hopefully it shows an example of test driven development. All the cool developers are doing TDD!
