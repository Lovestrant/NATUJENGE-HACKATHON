# NATUJENGE-HACKATHON

LINK FOR FUTURE REFERRALS
https://docs.google.com/document/d/1gCeJY4nVsZhbSjxwuMs-31Wh6WFv7QSl-rx1RsSvJXc/edit#heading=h.84b2gpg9xo1s


Unpack the Bytes Online Hackathon
Date: 19th May 2022 
Instructions
You have 30 minutes to answer the 2 programming challenges. 
You are meant to submit your code to a private repository on Github. 
Code changes committed after the cut-off time (30 minutes from the start) will be discarded. 
There are two (02) mandatory questions to be answered. 
The participant can earn a total of 26 pts. 
Partial points may be awarded when there is something wrong. 
The winner will be the participant with the highest points. In case of a tie, the last commit timestamp will be considered.


Q1: Decoding Stream Control Transmission Protocol(SCTP) - 15 pts
The Stream Control Transmission Protocol (SCTP) is a computer networking communications protocol in the transport layer of the Internet protocol suite. Originally intended for Signaling System 7 (SS7) message transport in telecommunication where UDP and TCP had limitations.

Data:
Below is a HEX stream representing the SCTP data(28 octets/bytes OR 56 nibbles): 

1355b6767988295e00000000000300347e581e360000000000000000

Task: 

You are required to write code to decode the above header and resolve the following values:
Common SCTP Header: 
Source Port - 16-bit unsigned integer (2pts)
Destination Port - 16-bit unsigned integer (2pts)
Verification tag - 32-bit unsigned integer (4pts)
Data Chunk:
Type  - 8-bit unsigned integer (2pts)
B flag - 1 bit - represented as boolean (3pts)
Length - 16 bit unsigned integer (2pts)

Reference Information: 

SCTP header can be divided into 2 parts; common SCTP header and chunks. In this question, we will be looking at the DATA chunk. The diagrams below indicate the data chunks in question. 

Common SCTP Header


SCTP Data Chunk



Additional reading: 
https://book.huihoo.com/iptables-tutorial/x1736.htm
https://datatracker.ietf.org/doc/html/rfc4960#section-3.1





Challenge 2: Tag Length Value Encoding - 11 pts

Introduction 

In a number of binary protocols, you will encounter Tag Length Value encoding, also known as TLV encoding. 

In TLV encoding, every parameter such as ‘name’ is given a numeric tag (e.g. 25). If your name is Hello, the value is set to Hello and the Length (in bytes) will be 5. In this case, our data will be represented as:

Tag: 25 (represented as 2 bytes - 0x0019)
Length: 6 (represented as 2 bytes -  0x0006)
Value: Hello (represented as bytes using UTF-8 - 0x48656C6C6F) 

The HEX stream representing the TLV encoded parameter will be: 
0x0019000648656C6C6F

Broken down into the T, L, and V :
0019 - Tag (represented in Big Endian) 
0006 - Length (represented in Big Endian)
48656C6C6F - Value (6 bytes long)

Task:

In Short Message Peer to Peer (SMPP) protocol, optional parameters are encoded in TLV. In this task, you are required to write code that will encode an optional parameter 'message_payload' that will carry our short message content (SMS content) represented in UTF-8 encoding. 

Tag: 0x0424 
Value: Hello Natujenge Σ!

In SMPP optional parameters:
Tag - is represented as 16 bits (2 bytes) unsigned number (Big Endian). 
Length - is represented as 16 bits (2 bytes) unsigned number (Big Endian). 
Value - represented as bytes encoded using the UTF-8 encoding scheme. 

You are required to write code to do the following:
Encode the Tag as 2 bytes (2 pts)
Identify the length of the SMS content - the number of octets (2pts) 
Encode the Length as 2 bytes (2pts)
Convert the Value (SMS content) into an array of bytes (2pts). 
Combine the 3 parts into one array of bytes; Tag, Length, and Value to provide the encoded message (3pts).
