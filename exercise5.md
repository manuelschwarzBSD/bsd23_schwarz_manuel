# excercise5
***
#### Why are we using logging librarys?

Logging Librarys are used to grant access to crucial protocol functions. Using these functions we are able to write down crucial events, states or errors that occur in the runtime. With those informations developers are able to understand the behavior of our programs better.

#### Which Loglevel are there in Log4J and what do they do?

In Log4J there are multiple different log-levels which define the priority of the protocol messages. Each log-level has a certain meaning and is used to describe the urgency of a protocol message.

The most common log-level are:

- TRACE: small an very detailled infos for debugging reasons.
- DEBUG: infos for the structure of the program.
- INFO: general informations for the developer.
- WARN: Warning for problems occuring while the program is running, but they are not that severe that they woul interfere the program from running further.
- ERROR: Errors occuring while the program is running.
- FATAL: critical Errors that terminate the program.

#### Which configuration possibilities are there in Log4J

There are many possibilities to configure the logging behavior. Some of the most essential are:

- configuration per XML or property files
- programmed Logging: 
    - you can use Klasses and Methods to configure Appender, Logger and other components dynamically.
- configuration of appenders:
    - you can use different kinds of appenders to send protocol messages to different destinations e.g. files, consoles, databases, syslog etc.
- configuration of log-levels:
    - you can configure individual loggers or packets to control the level of detail of the protocol messages.
- configuration of the layout:
    - you can konfifure the layout of protocol messages so protocol-information is better visualized.
