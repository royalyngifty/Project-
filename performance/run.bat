cd ..
cd ..
cd C:\Tools\apache-jmeter-5.3\bin
rmdir /s /q C:\Tools\Project-\performance\output
jmeter -n -t C:\Tools\Project-\performance\PrestShop.jmx -l C:\Tools\Project-\performance\output\log -e -o C:\Tools\Project-\performance\output
