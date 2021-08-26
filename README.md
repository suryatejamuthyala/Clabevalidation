# Clabevalidation

The CLABE (Clace Bancaria Estandarizada) is a banking standard for the numbering of bank accounts in Mexico. This standard is a requirement for the sending and receiving of international transfers since June 1, 2004. The CLABE account code has 18 digits which always contains the payee's bank account number.

Using this App, User can Validate the Clabe Number either as an Rest Endpoint

    http://localhost:8080/api/clabe/{ClabeNumber}

Or use a basic UI functionality.

##Contact

    Surya Teja Muthyala - https://www.linkedin.com/in/suryatejamuthyala/

#Algorithm

The control digit is calculated as the modulus 10 of 10 minus the modulus 10 of the sum of the modulus 10 of the product of the first 17 digits by its weight factor.[3][4]

The first 17 digits of the CLABE are, as mentioned above, the Bank Code, the Branch Office Code and the Account Number.

The weight factor of a given digit is:

3 if its position (starting at 0) modulus 3 is 0
7 if its position modulus 3 is 1
1 if its position modulus 3 is 2
A 17 digit weight is always "37137137137137137".

The method is:

For every digit, multiply it by its weight factor and take their modulus 10 (modulus is the Remainder of the integer division. The modulus X of a baseX number is its rightmost digit).
Sum all of the calculated products, and take modulus 10 again.
Subtract the sum to 10, take modulus 10, and you have the resulting control digit.
So, as an example:

Bank	Branch	Account Number
17 CLABE digits	0	3	2	1	8	0	0	0	0	1	1	8	3	5	9	7	1
×
Weight factors	3	7	1	3	7	1	3	7	1	3	7	1	3	7	1	3	7
= ( % 10 )
Products, modulus 10	0	1	2	3	6	0	0	0	0	3	7	8	9	5	9	1	7
Product sum, modulus 10	1
10 - sum, modulus 10	9 (control digit)
And so, the complete CLABE is: 032180000118359719


