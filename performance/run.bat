cd ..
cd ..
cd C:\Tools\apache-jmeter-5.3\bin
rmdir /s /q C:\Jenkins\var\workspace\Group1_2\performance\output
jmeter -n -t C:\Jenkins\var\workspace\Group1_2\performance\PrestShop.jmx -l C:\Jenkins\var\workspace\Group1_2\performance\output\log -e -o C:\Jenkins\var\workspace\Group1_2\performance\output
