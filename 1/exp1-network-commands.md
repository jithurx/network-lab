mtech@lenovo-001:~$ sudo apt install tcp
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
E: Unable to locate package tcp
mtech@lenovo-001:~$ sudo apt install tcpdump
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
tcpdump is already the newest version (4.99.1-3ubuntu0.2).
tcpdump set to manually installed.
0 upgraded, 0 newly installed, 0 to remove and 56 not upgraded.
mtech@lenovo-001:~$ man tcpdump
mtech@lenovo-001:~$ tcpdump
tcpdump: enp2s0: You don't have permission to capture on that device
(socket: Operation not permitted)
mtech@lenovo-001:~$ sudo tcpdump
tcpdump: verbose output suppressed, use -v[v]... for full protocol decode
listening on enp2s0, link-type EN10MB (Ethernet), snapshot length 262144 bytes
15:14:02.910134 ARP, Request who-has 10.10.69.173 tell 10.10.1.69, length 46
15:14:02.910149 ARP, Request who-has 10.10.70.173 tell 10.10.1.69, length 46
15:14:02.910151 ARP, Request who-has 10.10.71.173 tell 10.10.1.69, length 46
15:14:02.910153 ARP, Request who-has 10.10.72.173 tell 10.10.1.69, length 46
15:14:02.910155 ARP, Request who-has 10.10.73.173 tell 10.10.1.69, length 46
15:14:02.910157 ARP, Request who-has 10.10.74.173 tell 10.10.1.69, length 46
15:14:02.910158 ARP, Request who-has 10.10.75.173 tell 10.10.1.69, length 46
15:14:02.910160 ARP, Request who-has 10.10.76.173 tell 10.10.1.69, length 46
15:14:02.910178 ARP, Request who-has 10.10.77.173 tell 10.10.1.69, length 46
15:14:02.910180 ARP, Request who-has 10.10.78.173 tell 10.10.1.69, length 46
15:14:03.001835 IP lenovo-001.45210 > dns.google.domain: 20505+ [1au] PTR? 173.69.10.10.in-addr.arpa. (54)
15:14:03.014692 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:14:03.043067 IP dns.google.domain > lenovo-001.45210: 20505 NXDomain 0/0/1 (54)
15:14:03.043290 IP lenovo-001.45210 > dns.google.domain: 20505+ PTR? 173.69.10.10.in-addr.arpa. (43)
15:14:03.059579 IP dns.google.domain > lenovo-001.45210: 20505 NXDomain 0/0/0 (43)
15:14:03.060032 IP lenovo-001.53629 > dns.google.domain: 47567+ [1au] PTR? 69.1.10.10.in-addr.arpa. (52)
15:14:03.102201 IP dns.google.domain > lenovo-001.53629: 47567 NXDomain 0/0/1 (52)
15:14:03.102404 IP lenovo-001.53629 > dns.google.domain: 47567+ PTR? 69.1.10.10.in-addr.arpa. (41)
15:14:03.110854 ARP, Request who-has 10.10.69.173 tell 10.10.1.69, length 46
15:14:03.110870 ARP, Request who-has 10.10.70.173 tell 10.10.1.69, length 46
15:14:03.110872 ARP, Request who-has 10.10.71.173 tell 10.10.1.69, length 46
15:14:03.110874 ARP, Request who-has 10.10.72.173 tell 10.10.1.69, length 46
15:14:03.110875 ARP, Request who-has 10.10.73.173 tell 10.10.1.69, length 46
15:14:03.110877 ARP, Request who-has 10.10.74.173 tell 10.10.1.69, length 46
15:14:03.110879 ARP, Request who-has 10.10.75.173 tell 10.10.1.69, length 46
15:14:03.110880 ARP, Request who-has 10.10.76.173 tell 10.10.1.69, length 46
15:14:03.110901 ARP, Request who-has 10.10.77.173 tell 10.10.1.69, length 46
15:14:03.110903 ARP, Request who-has 10.10.78.173 tell 10.10.1.69, length 46
15:14:03.123330 IP dns.google.domain > lenovo-001.53629: 47567 NXDomain 0/0/0 (41)
15:14:03.123809 IP lenovo-001.37263 > dns.google.domain: 14399+ [1au] PTR? 173.70.10.10.in-addr.arpa. (54)
15:14:03.169005 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:14:03.169022 IP dns.google.domain > lenovo-001.37263: 14399 NXDomain 0/0/1 (54)
15:14:03.169201 IP lenovo-001.37263 > dns.google.domain: 14399+ PTR? 173.70.10.10.in-addr.arpa. (43)
15:14:03.186982 IP dns.google.domain > lenovo-001.37263: 14399 NXDomain 0/0/0 (43)
15:14:03.187520 IP lenovo-001.42486 > dns.google.domain: 56717+ [1au] PTR? 173.71.10.10.in-addr.arpa. (54)
15:14:03.222263 IP dns.google.domain > lenovo-001.42486: 56717 NXDomain 0/0/1 (54)
15:14:03.222458 IP lenovo-001.42486 > dns.google.domain: 56717+ PTR? 173.71.10.10.in-addr.arpa. (43)
15:14:03.239800 IP dns.google.domain > lenovo-001.42486: 56717 NXDomain 0/0/0 (43)
15:14:03.240259 IP lenovo-001.32979 > dns.google.domain: 21054+ [1au] PTR? 173.72.10.10.in-addr.arpa. (54)
15:14:03.284250 IP dns.google.domain > lenovo-001.32979: 21054 NXDomain 0/0/1 (54)
15:14:03.284372 IP lenovo-001.32979 > dns.google.domain: 21054+ PTR? 173.72.10.10.in-addr.arpa. (43)
15:14:03.300829 IP dns.google.domain > lenovo-001.32979: 21054 NXDomain 0/0/0 (43)
15:14:03.301156 IP lenovo-001.44066 > dns.google.domain: 8283+ [1au] PTR? 173.73.10.10.in-addr.arpa. (54)
15:14:03.311562 ARP, Request who-has 10.10.67.174 tell 10.10.1.69, length 46
15:14:03.311581 ARP, Request who-has 10.10.68.174 tell 10.10.1.69, length 46
15:14:03.311583 ARP, Request who-has 10.10.69.174 tell 10.10.1.69, length 46
15:14:03.311584 ARP, Request who-has 10.10.70.174 tell 10.10.1.69, length 46
15:14:03.311586 ARP, Request who-has 10.10.71.174 tell 10.10.1.69, length 46
15:14:03.311588 ARP, Request who-has 10.10.72.174 tell 10.10.1.69, length 46
15:14:03.311590 ARP, Request who-has 10.10.73.174 tell 10.10.1.69, length 46
15:14:03.311591 ARP, Request who-has 10.10.74.174 tell 10.10.1.69, length 46
15:14:03.311596 ARP, Request who-has 10.10.75.174 tell 10.10.1.69, length 46
15:14:03.311597 ARP, Request who-has 10.10.76.174 tell 10.10.1.69, length 46
15:14:03.350338 IP dns.google.domain > lenovo-001.44066: 8283 NXDomain 0/0/1 (54)
15:14:03.350432 IP lenovo-001.44066 > dns.google.domain: 8283+ PTR? 173.73.10.10.in-addr.arpa. (43)
15:14:03.371213 IP dns.google.domain > lenovo-001.44066: 8283 NXDomain 0/0/0 (43)
15:14:03.371568 IP lenovo-001.50430 > dns.google.domain: 39219+ [1au] PTR? 173.74.10.10.in-addr.arpa. (54)
15:14:03.380679 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:14:03.408699 IP dns.google.domain > lenovo-001.50430: 39219 NXDomain 0/0/1 (54)
15:14:03.408820 IP lenovo-001.50430 > dns.google.domain: 39219+ PTR? 173.74.10.10.in-addr.arpa. (43)
15:14:03.424456 IP dns.google.domain > lenovo-001.50430: 39219 NXDomain 0/0/0 (43)
15:14:03.424807 IP lenovo-001.48535 > dns.google.domain: 43813+ [1au] PTR? 173.75.10.10.in-addr.arpa. (54)
15:14:03.479063 IP dns.google.domain > lenovo-001.48535: 43813 NXDomain 0/0/1 (54)
15:14:03.479180 IP lenovo-001.48535 > dns.google.domain: 43813+ PTR? 173.75.10.10.in-addr.arpa. (43)
15:14:03.499691 IP dns.google.domain > lenovo-001.48535: 43813 NXDomain 0/0/0 (43)
15:14:03.500023 IP lenovo-001.39874 > dns.google.domain: 60191+ [1au] PTR? 173.76.10.10.in-addr.arpa. (54)
15:14:03.504045 ARP, Request who-has 10.10.1.92 tell 10.10.1.121, length 46
15:14:03.510442 IP 10.10.1.121.33365 > 255.255.255.255.29810: UDP, length 367
15:14:03.512177 ARP, Request who-has 10.10.67.174 tell 10.10.1.69, length 46
15:14:03.512188 ARP, Request who-has 10.10.68.174 tell 10.10.1.69, length 46
15:14:03.512190 ARP, Request who-has 10.10.69.174 tell 10.10.1.69, length 46
15:14:03.512191 ARP, Request who-has 10.10.70.174 tell 10.10.1.69, length 46
15:14:03.512193 ARP, Request who-has 10.10.71.174 tell 10.10.1.69, length 46
15:14:03.512195 ARP, Request who-has 10.10.72.174 tell 10.10.1.69, length 46
15:14:03.512196 ARP, Request who-has 10.10.73.174 tell 10.10.1.69, length 46
15:14:03.512198 ARP, Request who-has 10.10.74.174 tell 10.10.1.69, length 46
15:14:03.512210 ARP, Request who-has 10.10.75.174 tell 10.10.1.69, length 46
15:14:03.512212 ARP, Request who-has 10.10.76.174 tell 10.10.1.69, length 46
15:14:03.516602 IP dns.google.domain > lenovo-001.39874: 60191 NXDomain 0/0/1 (54)
15:14:03.516698 IP lenovo-001.39874 > dns.google.domain: 60191+ PTR? 173.76.10.10.in-addr.arpa. (43)
15:14:03.534387 IP dns.google.domain > lenovo-001.39874: 60191 NXDomain 0/0/0 (43)
15:14:03.534677 IP lenovo-001.45356 > dns.google.domain: 2775+ [1au] PTR? 173.77.10.10.in-addr.arpa. (54)
15:14:03.546149 ARP, Request who-has 10.10.1.102 tell 10.10.1.120, length 46
15:14:03.569345 IP dns.google.domain > lenovo-001.45356: 2775 NXDomain 0/0/1 (54)
15:14:03.569402 IP lenovo-001.45356 > dns.google.domain: 2775+ PTR? 173.77.10.10.in-addr.arpa. (43)
15:14:03.589484 IP dns.google.domain > lenovo-001.45356: 2775 NXDomain 0/0/0 (43)
15:14:03.589730 IP lenovo-001.60540 > dns.google.domain: 45032+ [1au] PTR? 173.78.10.10.in-addr.arpa. (54)
15:14:03.643574 IP dns.google.domain > lenovo-001.60540: 45032 NXDomain 0/0/1 (54)
15:14:03.643694 IP lenovo-001.60540 > dns.google.domain: 45032+ PTR? 173.78.10.10.in-addr.arpa. (43)
15:14:03.658628 IP dns.google.domain > lenovo-001.60540: 45032 NXDomain 0/0/0 (43)
15:14:03.673206 IP lenovo-001.36902 > dns.google.domain: 36578+ [1au] PTR? 8.8.8.8.in-addr.arpa. (49)
15:14:03.713158 ARP, Request who-has 10.10.65.175 tell 10.10.1.69, length 46
15:14:03.713174 ARP, Request who-has 10.10.66.175 tell 10.10.1.69, length 46
15:14:03.713176 ARP, Request who-has 10.10.67.175 tell 10.10.1.69, length 46
15:14:03.713177 ARP, Request who-has 10.10.68.175 tell 10.10.1.69, length 46
15:14:03.713179 ARP, Request who-has 10.10.69.175 tell 10.10.1.69, length 46
15:14:03.713181 ARP, Request who-has 10.10.70.175 tell 10.10.1.69, length 46
15:14:03.713182 ARP, Request who-has 10.10.71.175 tell 10.10.1.69, length 46
15:14:03.713184 ARP, Request who-has 10.10.72.175 tell 10.10.1.69, length 46
15:14:03.713202 ARP, Request who-has 10.10.73.175 tell 10.10.1.69, length 46
15:14:03.713204 ARP, Request who-has 10.10.74.175 tell 10.10.1.69, length 46
15:14:03.747331 IP dns.google.domain > lenovo-001.36902: 36578 1/0/1 PTR dns.google. (73)
15:14:03.747626 IP lenovo-001.46363 > dns.google.domain: 64768+ [1au] PTR? 105.1.10.10.in-addr.arpa. (53)
15:14:18.907582 IP lenovo-001.36658 > dns.google.domain: 17713+ [1au] PTR? 5.1.10.10.in-addr.arpa. (51)
15:14:18.907609 IP lenovo-001.43793 > dns.google.domain: 58135+ [1au] PTR? 124.1.10.10.in-addr.arpa. (53)
15:14:18.927389 IP dns.google.domain > lenovo-001.36658: 17713 NXDomain 0/0/1 (51)
15:14:18.927451 IP lenovo-001.36658 > dns.google.domain: 17713+ PTR? 5.1.10.10.in-addr.arpa. (40)
15:14:18.943143 IP dns.google.domain > lenovo-001.36658: 17713 NXDomain 0/0/0 (40)
15:14:18.943567 IP lenovo-001.54860 > dns.google.domain: 44721+ [1au] PTR? 2.1.10.10.in-addr.arpa. (51)
15:14:18.962170 IP dns.google.domain > lenovo-001.54860: 44721 NXDomain 0/0/1 (51)
15:14:18.962310 IP lenovo-001.54860 > dns.google.domain: 44721+ PTR? 2.1.10.10.in-addr.arpa. (40)
15:14:18.969403 ARP, Request who-has 10.10.69.208 tell 10.10.1.69, length 46
15:14:18.969408 ARP, Request who-has 10.10.70.208 tell 10.10.1.69, length 46
15:14:18.969408 ARP, Request who-has 10.10.71.208 tell 10.10.1.69, length 46
15:14:18.969408 ARP, Request who-has 10.10.72.208 tell 10.10.1.69, length 46
15:14:18.969434 ARP, Request who-has 10.10.73.208 tell 10.10.1.69, length 46
15:14:18.969435 ARP, Request who-has 10.10.74.208 tell 10.10.1.69, length 46
15:14:18.969435 ARP, Request who-has 10.10.75.208 tell 10.10.1.69, length 46
15:14:18.969436 ARP, Request who-has 10.10.76.208 tell 10.10.1.69, length 46
15:14:18.969436 ARP, Request who-has 10.10.77.208 tell 10.10.1.69, length 46
15:14:18.969436 ARP, Request who-has 10.10.78.208 tell 10.10.1.69, length 46
15:14:18.980052 IP dns.google.domain > lenovo-001.54860: 44721 NXDomain 0/0/0 (40)
15:14:18.980468 IP lenovo-001.39021 > dns.google.domain: 56141+ [1au] PTR? 174.67.10.10.in-addr.arpa. (54)
15:14:18.995029 IP lenovo-001.47707 > dns.google.domain: 61376+ [1au] A? firefox.settings.services.mozilla.com. (66)
15:14:18.995104 IP lenovo-001.39407 > dns.google.domain: 3116+ [1au] AAAA? firefox.settings.services.mozilla.com. (66)
15:14:19.000461 IP dns.google.domain > lenovo-001.39021: 56141 NXDomain 0/0/1 (54)
15:14:19.000543 IP lenovo-001.39021 > dns.google.domain: 56141+ PTR? 174.67.10.10.in-addr.arpa. (43)
15:14:19.012591 IP dns.google.domain > lenovo-001.47707: 61376 5/0/1 CNAME mozilla.map.fastly.net., A 151.101.129.91, A 151.101.1.91, A 151.101.65.91, A 151.101.193.91 (166)
15:14:19.021592 IP lenovo-001.47190 > dns.google.domain: 44392+ [1au] Type65? support.mozilla.org. (48)
15:14:19.021652 IP lenovo-001.57429 > dns.google.domain: 47857+ [1au] A? support.mozilla.org. (48)
15:14:19.021688 IP lenovo-001.51686 > dns.google.domain: 21190+ [1au] AAAA? support.mozilla.org. (48)
15:14:19.025030 IP dns.google.domain > lenovo-001.39021: 56141 NXDomain 0/0/0 (43)
15:14:19.025348 IP lenovo-001.43201 > dns.google.domain: 62370+ [1au] PTR? 174.68.10.10.in-addr.arpa. (54)
15:14:19.049346 IP dns.google.domain > lenovo-001.43201: 62370 NXDomain 0/0/1 (54)
15:14:19.049427 IP lenovo-001.43201 > dns.google.domain: 62370+ PTR? 174.68.10.10.in-addr.arpa. (43)
15:14:19.060915 IP dns.google.domain > lenovo-001.51686: 21190 5/0/1 CNAME mozilla.map.fastly.net., AAAA 2a04:4e42::347, AAAA 2a04:4e42:200::347, AAAA 2a04:4e42:600::347, AAAA 2a04:4e42:400::347 (196)
15:14:19.062025 IP dns.google.domain > lenovo-001.47190: 44392 1/1/1 CNAME mozilla.map.fastly.net. (145)
15:14:19.062148 IP lenovo-001.39243 > dns.google.domain: 42013+ [1au] Type65? mozilla.map.fastly.net. (51)
15:14:19.084265 IP dns.google.domain > lenovo-001.39243: 42013 0/1/1 (112)
15:14:19.170139 ARP, Request who-has 10.10.69.208 tell 10.10.1.69, length 46
15:14:19.170151 ARP, Request who-has 10.10.70.208 tell 10.10.1.69, length 46
15:14:19.170151 ARP, Request who-has 10.10.71.208 tell 10.10.1.69, length 46
15:14:19.170152 ARP, Request who-has 10.10.72.208 tell 10.10.1.69, length 46
15:14:19.170152 ARP, Request who-has 10.10.73.208 tell 10.10.1.69, length 46
15:14:19.170152 ARP, Request who-has 10.10.74.208 tell 10.10.1.69, length 46
15:14:19.170153 ARP, Request who-has 10.10.75.208 tell 10.10.1.69, length 46
15:14:19.170153 ARP, Request who-has 10.10.76.208 tell 10.10.1.69, length 46
15:14:19.170158 ARP, Request who-has 10.10.77.208 tell 10.10.1.69, length 46
15:14:19.170159 ARP, Request who-has 10.10.78.208 tell 10.10.1.69, length 46
15:14:34.407016 IP lenovo-001.50033 > dns.google.domain: 20008+ [1au] PTR? 92.1.10.10.in-addr.arpa. (52)
15:14:34.420326 ARP, Request who-has 10.10.73.241 tell 10.10.1.69, length 46
15:14:34.420330 ARP, Request who-has 10.10.74.241 tell 10.10.1.69, length 46
15:14:34.420330 ARP, Request who-has 10.10.75.241 tell 10.10.1.69, length 46
15:14:34.420330 ARP, Request who-has 10.10.76.241 tell 10.10.1.69, length 46
15:14:34.420331 ARP, Request who-has 10.10.77.241 tell 10.10.1.69, length 46
15:14:34.420331 ARP, Request who-has 10.10.78.241 tell 10.10.1.69, length 46
15:14:34.420356 ARP, Request who-has 10.10.79.241 tell 10.10.1.69, length 46
15:14:34.420356 ARP, Request who-has 10.10.64.242 tell 10.10.1.69, length 46
15:14:34.420356 ARP, Request who-has 10.10.65.242 tell 10.10.1.69, length 46
15:14:34.420357 ARP, Request who-has 10.10.66.242 tell 10.10.1.69, length 46
15:14:34.437055 IP dns.google.domain > lenovo-001.50033: 20008 NXDomain 0/0/1 (52)
15:14:34.437144 IP lenovo-001.50033 > dns.google.domain: 20008+ PTR? 92.1.10.10.in-addr.arpa. (41)
15:14:34.457997 IP dns.google.domain > lenovo-001.50033: 20008 NXDomain 0/0/0 (41)
15:14:34.458269 IP lenovo-001.38210 > dns.google.domain: 13834+ [1au] PTR? 121.1.10.10.in-addr.arpa. (53)
15:14:34.462731 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:14:34.475273 IP lenovo-001.44996 > dns.google.domain: 20254+ [1au] Type65? dyna.wikimedia.org. (47)
15:14:34.475306 IP lenovo-001.47622 > dns.google.domain: 40846+ [1au] A? support.mozilla.org. (48)
15:14:34.475332 IP lenovo-001.40805 > dns.google.domain: 16534+ [1au] Type65? support.mozilla.org. (48)
15:14:34.475556 IP lenovo-001.38550 > dns.google.domain: 65426+ [1au] Type65? ndtv.com. (37)
15:14:34.475707 IP lenovo-001.51616 > dns.google.domain: 2518+ [1au] Type65? reddit.map.fastly.net. (50)
15:14:34.475757 IP lenovo-001.52355 > dns.google.domain: 11776+ [1au] AAAA? reddit.map.fastly.net. (50)
15:14:34.475927 IP dns.google.domain > lenovo-001.38210: 13834 NXDomain 0/0/1 (53)
15:14:34.475940 IP lenovo-001.38210 > dns.google.domain: 13834+ PTR? 121.1.10.10.in-addr.arpa. (42)
15:14:34.476781 IP 93.243.107.34.bc.googleusercontent.com.https > lenovo-001.37330: Flags [P.], seq 3022509873:3022514441, ack 1529242573, win 1540, options [nop,nop,TS val 1427213 ecr 749351420], length 4568
15:14:34.476802 IP lenovo-001.37330 > 93.243.107.34.bc.googleusercontent.com.https: Flags [.], ack 4568, win 574, options [nop,nop,TS val 749351493 ecr 1427213], length 0
15:14:34.477862 IP lenovo-001.37330 > 93.243.107.34.bc.googleusercontent.com.https: Flags [P.], seq 1:65, ack 4568, win 574, options [nop,nop,TS val 749351494 ecr 1427213], length 64
15:14:34.477972 IP lenovo-001.37330 > 93.243.107.34.bc.googleusercontent.com.https: Flags [P.], seq 65:157, ack 4568, win 574, options [nop,nop,TS val 749351494 ecr 1427213], length 92
15:14:34.478016 IP 93.243.107.34.bc.googleusercontent.com.https > lenovo-001.37330: Flags [.], ack 65, win 1540, options [nop,nop,TS val 1427213 ecr 749351494], length 0
15:14:34.478094 IP 93.243.107.34.bc.googleusercontent.com.https > lenovo-001.37330: Flags [.], ack 157, win 1540, options [nop,nop,TS val 1427213 ecr 749351494], length 0
15:14:34.496021 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:14:34.503843 IP dns.google.domain > lenovo-001.38550: 65426 0/1/1 (105)
15:14:34.504603 IP dns.google.domain > lenovo-001.51616: 2518 0/1/1 (111)
15:14:34.505247 IP dns.google.domain > lenovo-001.52355: 11776 0/1/1 (111)
15:14:39.495424 IP lenovo-001.38559 > dns.google.domain: 59738+ [1au] PTR? 102.1.10.10.in-addr.arpa. (53)
15:14:39.496491 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:14:39.503390 IP dns.google.domain > lenovo-001.47622: 40846 5/0/1 CNAME mozilla.map.fastly.net., A 151.101.129.91, A 151.101.65.91, A 151.101.193.91, A 151.101.1.91 (148)
15:14:39.528258 IP dns.google.domain > lenovo-001.38559: 59738 NXDomain 0/0/1 (53)
15:14:39.528337 IP lenovo-001.38559 > dns.google.domain: 59738+ PTR? 102.1.10.10.in-addr.arpa. (42)
15:14:39.545826 IP dns.google.domain > lenovo-001.38559: 59738 NXDomain 0/0/0 (42)
15:14:39.546133 IP lenovo-001.41342 > dns.google.domain: 23552+ [1au] PTR? 120.1.10.10.in-addr.arpa. (53)
15:14:49.555531 IP lenovo-001.44932 > dns.google.domain: 53739+ [1au] PTR? 175.65.10.10.in-addr.arpa. (54)
15:14:49.567649 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:14:49.576786 IP lenovo-001.35776 > dns.google.domain: 12002+ [1au] A? firefox-settings-attachments.cdn.mozilla.net. (73)
15:14:49.597496 IP dns.google.domain > lenovo-001.35776: 12002 5/0/1 CNAME mozilla.map.fastly.net., A 151.101.193.91, A 151.101.129.91, A 151.101.1.91, A 151.101.65.91 (170)
15:14:49.598091 IP lenovo-001.50478 > 151.101.193.91.https: Flags [S], seq 3831628683, win 64240, options [mss 1460,sackOK,TS val 1788330023 ecr 0,nop,wscale 7], length 0
15:14:49.598113 IP lenovo-001.50494 > 151.101.193.91.https: Flags [S], seq 121330506, win 64240, options [mss 1460,sackOK,TS val 1788330023 ecr 0,nop,wscale 7], length 0
15:14:49.598124 IP lenovo-001.50510 > 151.101.193.91.https: Flags [S], seq 59658267, win 64240, options [mss 1460,sackOK,TS val 1788330023 ecr 0,nop,wscale 7], length 0
15:14:49.598550 IP 151.101.193.91.https > lenovo-001.50478: Flags [S.], seq 2230490179, ack 3831628684, win 32768, options [mss 1400,sackOK,TS val 1431749 ecr 1788330023,nop,wscale 5], length 0
15:14:49.598551 IP 151.101.193.91.https > lenovo-001.50494: Flags [S.], seq 1544050800, ack 121330507, win 32768, options [mss 1400,sackOK,TS val 1431749 ecr 1788330023,nop,wscale 5], length 0
15:14:49.598551 IP 151.101.193.91.https > lenovo-001.50510: Flags [S.], seq 3524455929, ack 59658268, win 32768, options [mss 1400,sackOK,TS val 1431749 ecr 1788330023,nop,wscale 5], length 0
15:14:49.598591 IP lenovo-001.50478 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 0
15:14:49.598603 IP lenovo-001.50494 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 0
15:14:49.598605 IP lenovo-001.50510 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 0
15:14:49.598661 IP lenovo-001.50478 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 229
15:14:49.598802 IP 151.101.193.91.https > lenovo-001.50478: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431749 ecr 1788330024], length 0
15:14:49.598813 IP lenovo-001.50510 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 229
15:14:49.598898 IP lenovo-001.50494 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330024 ecr 1431749], length 229
15:14:49.598958 IP 151.101.193.91.https > lenovo-001.50510: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431749 ecr 1788330024], length 0
15:14:49.599043 IP 151.101.193.91.https > lenovo-001.50494: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431749 ecr 1788330024], length 0
15:14:49.645222 IP lenovo-001.50512 > 151.101.193.91.https: Flags [S], seq 2498111931, win 64240, options [mss 1460,sackOK,TS val 1788330070 ecr 0,nop,wscale 7], length 0
15:14:49.645567 IP 151.101.193.91.https > lenovo-001.50512: Flags [S.], seq 3797690898, ack 2498111932, win 32768, options [mss 1400,sackOK,TS val 1431763 ecr 1788330070,nop,wscale 5], length 0
15:14:49.645622 IP lenovo-001.50512 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330071 ecr 1431763], length 0
15:14:49.645687 IP lenovo-001.50512 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330071 ecr 1431763], length 229
15:14:49.645814 IP 151.101.193.91.https > lenovo-001.50512: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431763 ecr 1788330071], length 0
15:14:49.654581 IP lenovo-001.50522 > 151.101.193.91.https: Flags [S], seq 208643030, win 64240, options [mss 1460,sackOK,TS val 1788330080 ecr 0,nop,wscale 7], length 0
15:14:49.654934 IP 151.101.193.91.https > lenovo-001.50522: Flags [S.], seq 3365433179, ack 208643031, win 32768, options [mss 1400,sackOK,TS val 1431766 ecr 1788330080,nop,wscale 5], length 0
15:14:49.654982 IP lenovo-001.50522 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330080 ecr 1431766], length 0
15:14:49.655047 IP lenovo-001.50522 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330080 ecr 1431766], length 229
15:14:49.655184 IP 151.101.193.91.https > lenovo-001.50522: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431766 ecr 1788330080], length 0
15:14:49.662314 IP lenovo-001.50524 > 151.101.193.91.https: Flags [S], seq 2476616401, win 64240, options [mss 1460,sackOK,TS val 1788330088 ecr 0,nop,wscale 7], length 0
15:14:49.662642 IP 151.101.193.91.https > lenovo-001.50524: Flags [S.], seq 3674253264, ack 2476616402, win 32768, options [mss 1400,sackOK,TS val 1431768 ecr 1788330088,nop,wscale 5], length 0
15:14:49.662681 IP lenovo-001.50524 > 151.101.193.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 1788330088 ecr 1431768], length 0
15:14:49.662748 IP lenovo-001.50524 > 151.101.193.91.https: Flags [P.], seq 1:230, ack 1, win 502, options [nop,nop,TS val 1788330088 ecr 1431768], length 229
15:14:49.662924 IP 151.101.193.91.https > lenovo-001.50478: Flags [P.], seq 1:4576, ack 230, win 1058, options [nop,nop,TS val 1431768 ecr 1788330024], length 4575
15:14:49.662924 IP 151.101.193.91.https > lenovo-001.50524: Flags [.], ack 230, win 1058, options [nop,nop,TS val 1431768 ecr 1788330088], length 0
15:14:49.662928 IP lenovo-001.50478 > 151.101.193.91.https: Flags [.], ack 4576, win 574, options [nop,nop,TS val 1788330088 ecr 1431768], length 0
15:15:00.495745 IP lenovo-001.46232 > dns.google.domain: 58229+ [1au] PTR? 208.69.10.10.in-addr.arpa. (54)
15:15:00.498813 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:15:00.506592 IP 10.10.1.69.43490 > 239.255.255.250.1900: UDP, length 173
15:15:00.599390 IP dns.google.domain > lenovo-001.46232: 58229 NXDomain 0/0/1 (54)
15:15:00.599503 IP lenovo-001.46232 > dns.google.domain: 58229+ PTR? 208.69.10.10.in-addr.arpa. (43)
15:15:00.618217 IP dns.google.domain > lenovo-001.46232: 58229 NXDomain 0/0/0 (43)
15:15:00.618656 IP lenovo-001.41330 > dns.google.domain: 12461+ [1au] PTR? 208.70.10.10.in-addr.arpa. (54)
15:15:00.652687 IP dns.google.domain > lenovo-001.41330: 12461 NXDomain 0/0/1 (54)
15:15:00.652809 IP lenovo-001.41330 > dns.google.domain: 12461+ PTR? 208.70.10.10.in-addr.arpa. (43)
15:15:00.667103 IP dns.google.domain > lenovo-001.41330: 12461 NXDomain 0/0/0 (43)
15:15:00.667526 IP lenovo-001.37751 > dns.google.domain: 13787+ [1au] PTR? 208.71.10.10.in-addr.arpa. (54)
15:15:00.695264 ARP, Request who-has 10.10.65.152 tell 10.10.1.69, length 46
15:15:00.695278 ARP, Request who-has 10.10.66.152 tell 10.10.1.69, length 46
15:15:00.695280 ARP, Request who-has 10.10.67.152 tell 10.10.1.69, length 46
15:15:00.695281 ARP, Request who-has 10.10.68.152 tell 10.10.1.69, length 46
15:15:00.695283 ARP, Request who-has 10.10.79.152 tell 10.10.1.69, length 46
15:15:00.695285 ARP, Request who-has 10.10.64.153 tell 10.10.1.69, length 46
15:15:00.695286 ARP, Request who-has 10.10.65.153 tell 10.10.1.69, length 46
15:15:00.695288 ARP, Request who-has 10.10.66.153 tell 10.10.1.69, length 46
15:15:00.695308 ARP, Request who-has 10.10.77.153 tell 10.10.1.69, length 46
15:15:00.695310 ARP, Request who-has 10.10.78.153 tell 10.10.1.69, length 46
15:15:06.053397 IP lenovo-001.50716 > dns.google.domain: 52311+ [1au] PTR? 241.73.10.10.in-addr.arpa. (54)
15:15:06.109274 ARP, Request who-has 10.10.73.191 tell 10.10.1.69, length 46
15:15:06.109289 ARP, Request who-has 10.10.74.191 tell 10.10.1.69, length 46
15:15:06.109291 ARP, Request who-has 10.10.69.192 tell 10.10.1.69, length 46
15:15:06.109293 ARP, Request who-has 10.10.70.192 tell 10.10.1.69, length 46
15:15:06.109295 ARP, Request who-has 10.10.71.192 tell 10.10.1.69, length 46
15:15:06.109296 ARP, Request who-has 10.10.72.192 tell 10.10.1.69, length 46
15:15:06.109298 ARP, Request who-has 10.10.67.193 tell 10.10.1.69, length 46
15:15:06.109300 ARP, Request who-has 10.10.68.193 tell 10.10.1.69, length 46
15:15:06.109317 ARP, Request who-has 10.10.69.193 tell 10.10.1.69, length 46
15:15:06.109319 ARP, Request who-has 10.10.70.193 tell 10.10.1.69, length 46
15:15:06.125932 IP dns.google.domain > lenovo-001.50716: 52311 NXDomain 0/0/1 (54)
15:15:06.126052 IP lenovo-001.50716 > dns.google.domain: 52311+ PTR? 241.73.10.10.in-addr.arpa. (43)
15:15:06.146306 IP dns.google.domain > lenovo-001.50716: 52311 NXDomain 0/0/0 (43)
15:15:06.146774 IP lenovo-001.38246 > dns.google.domain: 61563+ [1au] PTR? 241.74.10.10.in-addr.arpa. (54)
15:15:06.201327 IP dns.google.domain > lenovo-001.38246: 61563 NXDomain 0/0/1 (54)
15:15:06.201447 IP lenovo-001.38246 > dns.google.domain: 61563+ PTR? 241.74.10.10.in-addr.arpa. (43)
15:15:06.221392 IP dns.google.domain > lenovo-001.38246: 61563 NXDomain 0/0/0 (43)
15:15:06.221831 IP lenovo-001.38591 > dns.google.domain: 24026+ [1au] PTR? 241.75.10.10.in-addr.arpa. (54)
15:15:06.296323 IP dns.google.domain > lenovo-001.38591: 24026 NXDomain 0/0/1 (54)
15:15:06.296440 IP lenovo-001.38591 > dns.google.domain: 24026+ PTR? 241.75.10.10.in-addr.arpa. (43)
15:15:06.309755 ARP, Request who-has 10.10.79.194 tell 10.10.1.69, length 46
15:15:06.309770 ARP, Request who-has 10.10.64.195 tell 10.10.1.69, length 46
15:15:06.309772 ARP, Request who-has 10.10.65.195 tell 10.10.1.69, length 46
15:15:06.309774 ARP, Request who-has 10.10.66.195 tell 10.10.1.69, length 46
15:15:06.309775 ARP, Request who-has 10.10.77.195 tell 10.10.1.69, length 46
15:15:06.309777 ARP, Request who-has 10.10.78.195 tell 10.10.1.69, length 46
15:15:06.309779 ARP, Request who-has 10.10.79.195 tell 10.10.1.69, length 46
15:15:06.309781 ARP, Request who-has 10.10.64.196 tell 10.10.1.69, length 46
15:15:06.309798 ARP, Request who-has 10.10.75.196 tell 10.10.1.69, length 46
15:15:06.309800 ARP, Request who-has 10.10.76.196 tell 10.10.1.69, length 46
15:15:06.311807 IP dns.google.domain > lenovo-001.38591: 24026 NXDomain 0/0/0 (43)
15:15:06.312252 IP lenovo-001.50281 > dns.google.domain: 33311+ [1au] PTR? 241.76.10.10.in-addr.arpa. (54)
15:15:06.363909 IP dns.google.domain > lenovo-001.50281: 33311 NXDomain 0/0/1 (54)
15:15:06.364025 IP lenovo-001.50281 > dns.google.domain: 33311+ PTR? 241.76.10.10.in-addr.arpa. (43)
15:15:21.681133 IP lenovo-001.35213 > dns.google.domain: 61077+ [1au] PTR? 91.193.101.151.in-addr.arpa. (56)
15:15:21.695900 IP dns.google.domain > lenovo-001.39786: 16151 NXDomain 0/0/0 (43)
15:15:21.701571 IP dns.google.domain > lenovo-001.35213: 61077 NXDomain 0/1/1 (116)
15:15:21.701661 IP lenovo-001.35213 > dns.google.domain: 61077+ PTR? 91.193.101.151.in-addr.arpa. (45)
15:15:21.710424 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37662: Flags [P.], seq 1726762231:1726762269, ack 139541274, win 1058, options [nop,nop,TS val 1441381 ecr 4003664955], length 38
15:15:21.724609 IP dns.google.domain > lenovo-001.35213: 61077 NXDomain 0/1/0 (105)
15:15:21.725071 IP lenovo-001.37122 > dns.google.domain: 19337+ [1au] PTR? 250.255.255.239.in-addr.arpa. (57)
15:15:21.743266 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [P.], seq 1997268896:1997273403, ack 3942360772, win 1058, options [nop,nop,TS val 1441391 ecr 4003664900], length 4507
15:15:21.743282 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [.], ack 4507, win 573, options [nop,nop,TS val 4003665026 ecr 1441391], length 0
15:15:21.743704 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [P.], seq 1:94, ack 4507, win 573, options [nop,nop,TS val 4003665026 ecr 1441391], length 93
15:15:21.743845 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [.], ack 94, win 1058, options [nop,nop,TS val 1441391 ecr 4003665026], length 0
15:15:21.744974 IP dns.google.domain > lenovo-001.37122: 19337 NXDomain 0/1/1 (114)
15:15:21.745030 IP lenovo-001.37122 > dns.google.domain: 19337+ PTR? 250.255.255.239.in-addr.arpa. (46)
15:15:21.746105 ARP, Request who-has 10.10.65.194 tell 10.10.1.69, length 46
15:15:21.746108 ARP, Request who-has 10.10.66.194 tell 10.10.1.69, length 46
15:15:21.746137 ARP, Request who-has 10.10.67.194 tell 10.10.1.69, length 46
15:15:21.746138 ARP, Request who-has 10.10.68.194 tell 10.10.1.69, length 46
15:15:21.746138 ARP, Request who-has 10.10.77.196 tell 10.10.1.69, length 46
15:15:21.746139 ARP, Request who-has 10.10.78.196 tell 10.10.1.69, length 46
15:15:21.746139 ARP, Request who-has 10.10.73.197 tell 10.10.1.69, length 46
15:15:21.746140 ARP, Request who-has 10.10.74.197 tell 10.10.1.69, length 46
15:15:21.746140 ARP, Request who-has 10.10.67.200 tell 10.10.1.69, length 46
15:15:21.746141 ARP, Request who-has 10.10.68.200 tell 10.10.1.69, length 46
15:15:21.752232 IP lenovo-001.37662 > 191.144.160.34.bc.googleusercontent.com.https: Flags [.], ack 38, win 595, options [nop,nop,TS val 4003665035 ecr 1441381], length 0
15:15:21.766508 IP dns.google.domain > lenovo-001.37122: 19337 NXDomain 0/1/0 (103)
15:15:21.766854 IP lenovo-001.39859 > dns.google.domain: 36986+ [1au] PTR? 152.65.10.10.in-addr.arpa. (54)
15:15:21.773903 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [P.], seq 4507:4818, ack 94, win 1058, options [nop,nop,TS val 1441400 ecr 4003665026], length 311
15:15:21.774167 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [P.], seq 94:210, ack 4818, win 595, options [nop,nop,TS val 4003665056 ecr 1441400], length 116
15:15:21.774330 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [P.], seq 4818:4887, ack 210, win 1058, options [nop,nop,TS val 1441400 ecr 4003665056], length 69
15:15:21.774416 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [P.], seq 210:241, ack 4887, win 595, options [nop,nop,TS val 4003665057 ecr 1441400], length 31
15:15:21.774422 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [F.], seq 241, ack 4887, win 595, options [nop,nop,TS val 4003665057 ecr 1441400], length 0
15:15:21.778296 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [F.], seq 241, ack 4887, win 595, options [nop,nop,TS val 4003665061 ecr 1441400], length 0
15:15:21.778403 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [.], ack 242, win 1058, options [nop,nop,TS val 1441402 ecr 4003665057,nop,nop,sack 1 {241:242}], length 0
15:15:21.804102 IP 191.144.160.34.bc.googleusercontent.com.https > lenovo-001.37676: Flags [P.], seq 4887:4925, ack 242, win 1058, options [nop,nop,TS val 1441409 ecr 4003665057], length 38
15:15:21.804116 IP lenovo-001.37676 > 191.144.160.34.bc.googleusercontent.com.https: Flags [R], seq 3942361013, win 0, length 0
15:15:21.884534 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:15:21.924988 IP lenovo-001.52390 > dns.google.domain: 16975+ [1au] A? support.mozilla.org. (48)
15:15:21.925027 IP lenovo-001.55822 > dns.google.domain: 3839+ [1au] Type65? support.mozilla.org. (48)
15:15:21.925050 IP lenovo-001.46289 > dns.google.domain: 12365+ [1au] AAAA? support.mozilla.org. (48)
15:15:21.925098 IP lenovo-001.57774 > dns.google.domain: 16974+ [1au] Type65? dyna.wikimedia.org. (47)
15:15:21.925193 IP lenovo-001.57489 > dns.google.domain: 15853+ [1au] Type65? www.reddit.com. (43)
15:15:21.925246 IP lenovo-001.36761 > dns.google.domain: 8432+ [1au] Type65? ndtv.com. (37)
15:15:21.925394 IP lenovo-001.56526 > dns.google.domain: 31091+ [1au] A? ndtv.com. (37)
15:15:21.925412 IP lenovo-001.38494 > dns.google.domain: 33372+ [1au] AAAA? ndtv.com. (37)
15:15:21.925432 IP lenovo-001.49987 > dns.google.domain: 5744+ [1au] A? www.reddit.com. (43)
15:15:21.925452 IP lenovo-001.50796 > dns.google.domain: 38657+ [1au] AAAA? www.reddit.com. (43)
15:15:21.943800 IP dns.google.domain > lenovo-001.52390: 16975 5/0/1 CNAME mozilla.map.fastly.net., A 151.101.65.91, A 151.101.1.91, A 151.101.129.91, A 151.101.193.91 (148)
15:15:21.944684 IP dns.google.domain > lenovo-001.46289: 12365 5/0/1 CNAME mozilla.map.fastly.net., AAAA 2a04:4e42:200::347, AAAA 2a04:4e42:600::347, AAAA 2a04:4e42:400::347, AAAA 2a04:4e42::347 (196)
15:15:21.945954 IP dns.google.domain > lenovo-001.36761: 8432 0/1/1 (105)
15:15:21.946582 ARP, Request who-has 10.10.75.203 tell 10.10.1.69, length 46
15:15:21.946587 ARP, Request who-has 10.10.76.203 tell 10.10.1.69, length 46
15:15:21.946588 ARP, Request who-has 10.10.69.206 tell 10.10.1.69, length 46
15:15:21.946588 ARP, Request who-has 10.10.70.206 tell 10.10.1.69, length 46
15:15:21.946617 ARP, Request who-has 10.10.71.206 tell 10.10.1.69, length 46
15:15:21.946617 ARP, Request who-has 10.10.72.206 tell 10.10.1.69, length 46
15:15:21.946618 ARP, Request who-has 10.10.65.209 tell 10.10.1.69, length 46
15:15:21.946618 ARP, Request who-has 10.10.66.209 tell 10.10.1.69, length 46
15:15:21.946618 ARP, Request who-has 10.10.77.209 tell 10.10.1.69, length 46
15:15:21.946619 ARP, Request who-has 10.10.78.209 tell 10.10.1.69, length 46
15:15:21.964347 IP dns.google.domain > lenovo-001.38494: 33372 2/0/1 AAAA 2600:1417:71:188::24e8, AAAA 2600:1417:71:186::24e8 (93)
15:15:21.975395 IP dns.google.domain > lenovo-001.50796: 38657 1/1/1 CNAME reddit.map.fastly.net. (136)
15:15:21.975530 IP lenovo-001.33762 > dns.google.domain: 25838+ [1au] AAAA? reddit.map.fastly.net. (50)
15:15:21.976094 IP dns.google.domain > lenovo-001.49987: 5744 5/0/1 CNAME reddit.map.fastly.net., A 151.101.193.140, A 151.101.1.140, A 151.101.65.140, A 151.101.129.140 (142)
15:15:22.003297 IP lenovo-001.37385 > dns.google.domain: 14896+ [1au] A? firefox.settings.services.mozilla.com. (66)
15:15:22.003344 IP lenovo-001.59527 > dns.google.domain: 2709+ [1au] AAAA? firefox.settings.services.mozilla.com. (66)
15:15:22.012790 IP dns.google.domain > lenovo-001.33762: 25838 0/1/1 (111)
15:15:22.082743 IP dns.google.domain > lenovo-001.56526: 31091 1/0/1 A 23.57.33.159 (53)
15:15:22.085475 IP dns.google.domain > lenovo-001.37385: 14896 5/0/1 CNAME mozilla.map.fastly.net., A 151.101.65.91, A 151.101.129.91, A 151.101.193.91, A 151.101.1.91 (166)
15:15:22.085511 IP dns.google.domain > lenovo-001.59527: 2709 5/0/1 CNAME mozilla.map.fastly.net., AAAA 2a04:4e42::347, AAAA 2a04:4e42:200::347, AAAA 2a04:4e42:400::347, AAAA 2a04:4e42:600::347 (214)
15:15:22.085939 IP lenovo-001.35544 > 151.101.65.91.https: Flags [S], seq 2660933305, win 64240, options [mss 1460,sackOK,TS val 2917560624 ecr 0,nop,wscale 7], length 0
15:15:22.086214 IP 151.101.65.91.https > lenovo-001.35544: Flags [S.], seq 966514522, ack 2660933306, win 32768, options [mss 1400,sackOK,TS val 1441494 ecr 2917560624,nop,wscale 5], length 0
15:15:22.086233 IP lenovo-001.35544 > 151.101.65.91.https: Flags [.], ack 1, win 502, options [nop,nop,TS val 2917560625 ecr 1441494], length 0
15:15:22.086336 IP lenovo-001.35544 > 151.101.65.91.https: Flags [P.], seq 1:223, ack 1, win 502, options [nop,nop,TS val 2917560625 ecr 1441494], length 222
15:15:22.086452 IP 151.101.65.91.https > lenovo-001.35544: Flags [.], ack 223, win 1058, options [nop,nop,TS val 1441494 ecr 2917560625], length 0
15:15:37.511391 IP lenovo-001.32998 > dns.google.domain: 51284+ [1au] PTR? 191.73.10.10.in-addr.arpa. (54)
15:15:37.526802 IP bom07s32-in-f6.1e100.net.https > lenovo-001.39232: UDP, length 43
15:15:37.566494 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 1252
15:15:37.586232 IP bom07s32-in-f6.1e100.net.https > lenovo-001.39232: UDP, length 3756
15:15:37.586319 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 1252
15:15:37.586331 IP bom07s32-in-f6.1e100.net.https > lenovo-001.39232: UDP, length 1252
15:15:37.586851 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 1252
15:15:37.603111 IP bom07s32-in-f6.1e100.net.https > lenovo-001.39232: UDP, length 1252
15:15:37.603209 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 42
15:15:37.603429 IP bom07s32-in-f6.1e100.net.https > lenovo-001.39232: UDP, length 1060
15:15:37.603841 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 42
15:15:37.604930 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 131
15:15:37.604938 IP lenovo-001.39232 > bom07s32-in-f6.1e100.net.https: UDP, length 80
15:15:48.254761 IP lenovo-001.57834 > dns.google.domain: 55690+ [1au] PTR? 194.79.10.10.in-addr.arpa. (54)
15:15:48.273503 IP dns.google.domain > lenovo-001.57834: 55690 NXDomain 0/0/1 (54)
15:15:48.273709 IP lenovo-001.57834 > dns.google.domain: 55690+ PTR? 194.79.10.10.in-addr.arpa. (43)
15:15:48.291479 IP dns.google.domain > lenovo-001.57834: 55690 NXDomain 0/0/0 (43)
15:15:48.291988 IP lenovo-001.54652 > dns.google.domain: 54355+ [1au] PTR? 195.64.10.10.in-addr.arpa. (54)
15:15:48.308330 IP dns.google.domain > lenovo-001.54652: 54355 NXDomain 0/0/1 (54)
15:15:48.308514 IP lenovo-001.54652 > dns.google.domain: 54355+ PTR? 195.64.10.10.in-addr.arpa. (43)
15:15:48.324489 IP dns.google.domain > lenovo-001.54652: 54355 NXDomain 0/0/0 (43)
15:15:48.324807 IP lenovo-001.44819 > dns.google.domain: 4312+ [1au] PTR? 195.65.10.10.in-addr.arpa. (54)
15:15:48.340455 IP dns.google.domain > lenovo-001.44819: 4312 NXDomain 0/0/1 (54)
15:15:48.340513 IP lenovo-001.44819 > dns.google.domain: 4312+ PTR? 195.65.10.10.in-addr.arpa. (43)
15:15:48.349023 ARP, Request who-has 10.10.93.43 tell 10.10.1.69, length 46
15:15:48.349029 ARP, Request who-has 10.10.94.43 tell 10.10.1.69, length 46
15:15:48.349029 ARP, Request who-has 10.10.95.43 tell 10.10.1.69, length 46
15:15:48.349029 ARP, Request who-has 10.10.80.44 tell 10.10.1.69, length 46
15:15:48.349056 ARP, Request who-has 10.10.81.44 tell 10.10.1.69, length 46
15:15:48.349056 ARP, Request who-has 10.10.82.44 tell 10.10.1.69, length 46
15:15:48.349056 ARP, Request who-has 10.10.83.44 tell 10.10.1.69, length 46
15:15:48.349057 ARP, Request who-has 10.10.84.44 tell 10.10.1.69, length 46
15:15:48.349057 ARP, Request who-has 10.10.85.44 tell 10.10.1.69, length 46
15:15:48.349057 ARP, Request who-has 10.10.86.44 tell 10.10.1.69, length 46
15:15:48.354579 IP dns.google.domain > lenovo-001.44819: 4312 NXDomain 0/0/0 (43)
15:15:48.354877 IP lenovo-001.50660 > dns.google.domain: 37766+ [1au] PTR? 195.66.10.10.in-addr.arpa. (54)
15:15:48.377141 IP dns.google.domain > lenovo-001.50660: 37766 NXDomain 0/0/1 (54)
15:15:48.377205 IP lenovo-001.50660 > dns.google.domain: 37766+ PTR? 195.66.10.10.in-addr.arpa. (43)
15:15:48.392353 IP dns.google.domain > lenovo-001.50660: 37766 NXDomain 0/0/0 (43)
15:15:48.392596 IP lenovo-001.49975 > dns.google.domain: 20322+ [1au] PTR? 195.77.10.10.in-addr.arpa. (54)
15:15:48.461624 IP dns.google.domain > lenovo-001.49975: 20322 NXDomain 0/0/1 (54)
15:15:48.461741 IP lenovo-001.49975 > dns.google.domain: 20322+ PTR? 195.77.10.10.in-addr.arpa. (43)
15:15:48.695884 IP lenovo-001.44971 > dns.google.domain: 51773+ [1au] PTR? 191.144.160.34.in-addr.arpa. (56)
15:15:48.751592 ARP, Request who-has 10.10.91.44 tell 10.10.1.69, length 46
15:15:48.751608 ARP, Request who-has 10.10.92.44 tell 10.10.1.69, length 46
15:15:48.751610 ARP, Request who-has 10.10.93.44 tell 10.10.1.69, length 46
15:15:48.751612 ARP, Request who-has 10.10.94.44 tell 10.10.1.69, length 46
15:15:48.751613 ARP, Request who-has 10.10.95.44 tell 10.10.1.69, length 46
15:15:48.751615 ARP, Request who-has 10.10.80.45 tell 10.10.1.69, length 46
15:15:48.751617 ARP, Request who-has 10.10.81.45 tell 10.10.1.69, length 46
15:15:48.751618 ARP, Request who-has 10.10.82.45 tell 10.10.1.69, length 46
15:15:48.751635 ARP, Request who-has 10.10.83.45 tell 10.10.1.69, length 46
15:15:48.751641 ARP, Request who-has 10.10.84.45 tell 10.10.1.69, length 46
15:15:48.755101 IP dns.google.domain > lenovo-001.44971: 51773 1/0/1 PTR 191.144.160.34.bc.googleusercontent.com. (109)
15:15:48.755704 IP lenovo-001.58203 > dns.google.domain: 30731+ [1au] PTR? 194.65.10.10.in-addr.arpa. (54)
15:15:48.780136 IP dns.google.domain > lenovo-001.58203: 30731 NXDomain 0/0/1 (54)
15:15:48.780332 IP lenovo-001.58203 > dns.google.domain: 30731+ PTR? 194.65.10.10.in-addr.arpa. (43)
15:16:04.210561 IP lenovo-001.56440 > dns.google.domain: 7954+ [1au] PTR? 203.75.10.10.in-addr.arpa. (54)
15:16:04.234547 ARP, Request who-has 10.10.93.78 tell 10.10.1.69, length 46
15:16:04.234558 ARP, Request who-has 10.10.94.78 tell 10.10.1.69, length 46
15:16:04.234560 ARP, Request who-has 10.10.95.78 tell 10.10.1.69, length 46
15:16:04.234562 ARP, Request who-has 10.10.80.79 tell 10.10.1.69, length 46
15:16:04.234564 ARP, Request who-has 10.10.81.79 tell 10.10.1.69, length 46
15:16:04.234565 ARP, Request who-has 10.10.82.79 tell 10.10.1.69, length 46
15:16:04.234567 ARP, Request who-has 10.10.83.79 tell 10.10.1.69, length 46
15:16:04.234569 ARP, Request who-has 10.10.84.79 tell 10.10.1.69, length 46
15:16:04.234584 ARP, Request who-has 10.10.85.79 tell 10.10.1.69, length 46
15:16:04.234586 ARP, Request who-has 10.10.86.79 tell 10.10.1.69, length 46
15:16:04.238665 IP dns.google.domain > lenovo-001.56440: 7954 NXDomain 0/0/1 (54)
15:16:04.238771 IP lenovo-001.56440 > dns.google.domain: 7954+ PTR? 203.75.10.10.in-addr.arpa. (43)
15:16:04.258455 IP dns.google.domain > lenovo-001.56440: 7954 NXDomain 0/0/0 (43)
15:16:04.258772 IP lenovo-001.55295 > dns.google.domain: 14338+ [1au] PTR? 203.76.10.10.in-addr.arpa. (54)
15:16:04.262321 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:16:04.274880 IP dns.google.domain > lenovo-001.55295: 14338 NXDomain 0/0/1 (54)
15:16:04.275012 IP lenovo-001.55295 > dns.google.domain: 14338+ PTR? 203.76.10.10.in-addr.arpa. (43)
15:16:04.289848 IP dns.google.domain > lenovo-001.55295: 14338 NXDomain 0/0/0 (43)
15:16:04.290313 IP lenovo-001.58123 > dns.google.domain: 60961+ [1au] PTR? 206.69.10.10.in-addr.arpa. (54)
15:16:04.317797 IP dns.google.domain > lenovo-001.58123: 60961 NXDomain 0/0/1 (54)
15:16:04.317915 IP lenovo-001.58123 > dns.google.domain: 60961+ PTR? 206.69.10.10.in-addr.arpa. (43)
15:16:04.333417 IP dns.google.domain > lenovo-001.58123: 60961 NXDomain 0/0/0 (43)
15:16:04.333870 IP lenovo-001.47253 > dns.google.domain: 16369+ [1au] PTR? 206.70.10.10.in-addr.arpa. (54)
15:16:04.364666 IP dns.google.domain > lenovo-001.47253: 16369 NXDomain 0/0/1 (54)
15:16:04.364786 IP lenovo-001.47253 > dns.google.domain: 16369+ PTR? 206.70.10.10.in-addr.arpa. (43)
15:16:04.383146 IP dns.google.domain > lenovo-001.47253: 16369 NXDomain 0/0/0 (43)
15:16:04.383644 IP lenovo-001.42658 > dns.google.domain: 4220+ [1au] PTR? 206.71.10.10.in-addr.arpa. (54)
15:16:04.404426 IP 10.10.1.124 > igmp.mcast.net: igmp v3 report, 1 group record(s)
15:16:04.408078 IP dns.google.domain > lenovo-001.42658: 4220 NXDomain 0/0/1 (54)
15:16:04.408184 IP lenovo-001.42658 > dns.google.domain: 4220+ PTR? 206.71.10.10.in-addr.arpa. (43)
15:16:09.859174 IP lenovo-001.32911 > dns.google.domain: 27265+ [1au] PTR? 91.65.101.151.in-addr.arpa. (55)
15:16:09.863172 ARP, Request who-has 10.10.81.91 tell 10.10.1.69, length 46
15:16:09.863180 ARP, Request who-has 10.10.82.91 tell 10.10.1.69, length 46
15:16:09.863182 ARP, Request who-has 10.10.83.91 tell 10.10.1.69, length 46
15:16:09.863184 ARP, Request who-has 10.10.84.91 tell 10.10.1.69, length 46
15:16:09.863185 ARP, Request who-has 10.10.85.91 tell 10.10.1.69, length 46
^C15:16:09.863187 ARP, Request who-has 10.10.86.91 tell 10.10.1.69, length 46

451 packets captured
25499 packets received by filter
24970 packets dropped by kernel
mtech@lenovo-001:~$ man ifconfig
mtech@lenovo-001:~$ ifconfig
enp2s0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 10.10.1.105  netmask 255.255.0.0  broadcast 10.10.255.255
        inet6 fe80::cccc:d846:8ea0:eff  prefixlen 64  scopeid 0x20<link>
        ether f4:6b:8c:8c:ee:1f  txqueuelen 1000  (Ethernet)
        RX packets 562783  bytes 257262614 (257.2 MB)
        RX errors 0  dropped 91  overruns 0  frame 0
        TX packets 99600  bytes 18478670 (18.4 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 34238  bytes 3099838 (3.0 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 34238  bytes 3099838 (3.0 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

mtech@lenovo-001:~$ man ip
mtech@lenovo-001:~$ ip addr
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp2s0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether f4:6b:8c:8c:ee:1f brd ff:ff:ff:ff:ff:ff
    inet 10.10.1.105/16 brd 10.10.255.255 scope global dynamic noprefixroute enp2s0
       valid_lft 23970sec preferred_lft 23970sec
    inet6 fe80::cccc:d846:8ea0:eff/64 scope link noprefixroute 
       valid_lft forever preferred_lft forever
mtech@lenovo-001:~$ man namp
No manual entry for namp
mtech@lenovo-001:~$ man nmap
mtech@lenovo-001:~$ sudo nmap -A 10.10.1.64
Starting Nmap 7.80 ( https://nmap.org ) at 2026-07-08 15:19 IST
Nmap scan report for 10.10.1.64
Host is up (0.00022s latency).
Not shown: 999 closed ports
PORT   STATE SERVICE VERSION
22/tcp open  ssh     OpenSSH 8.9p1 Ubuntu 3ubuntu0.15 (Ubuntu Linux; protocol 2.0)
MAC Address: F4:6B:8C:8C:EE:5F (Unknown)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.80%E=4%D=7/8%OT=22%CT=1%CU=31258%PV=Y%DS=1%DC=D%G=Y%M=F46B8C%TM
OS:=6A4E1D28%P=x86_64-pc-linux-gnu)SEQ(SP=104%GCD=1%ISR=10A%TI=Z%CI=Z%II=I%
OS:TS=A)SEQ(SP=104%GCD=1%ISR=10A%TI=Z%CI=Z%TS=A)OPS(O1=M5B4ST11NW7%O2=M5B4S
OS:T11NW7%O3=M5B4NNT11NW7%O4=M5B4ST11NW7%O5=M5B4ST11NW7%O6=M5B4ST11)WIN(W1=
OS:FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=
OS:M5B4NNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)
OS:T4(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S
OS:+%F=AR%O=%RD=0%Q=)T6(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T7(R=Y%DF=
OS:Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G
OS:%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 1 hop
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE
HOP RTT     ADDRESS
1   0.22 ms 10.10.1.64

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 12.15 seconds
mtech@lenovo-001:~$ sudo tcpdump
tcpdump: verbose output suppressed, use -v[v]... for full protocol decode
listening on enp2s0, link-type EN10MB (Ethernet), snapshot length 262144 bytes
15:19:46.521290 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:19:46.609368 ARP, Request who-has 10.10.111.203 tell 10.10.1.69, length 46
15:19:46.609384 ARP, Request who-has 10.10.96.204 tell 10.10.1.69, length 46
15:19:46.609386 ARP, Request who-has 10.10.97.204 tell 10.10.1.69, length 46
15:19:46.609388 ARP, Request who-has 10.10.98.204 tell 10.10.1.69, length 46
15:19:46.609390 ARP, Request who-has 10.10.99.204 tell 10.10.1.69, length 46
15:19:46.609392 ARP, Request who-has 10.10.100.204 tell 10.10.1.69, length 46
15:19:46.609394 ARP, Request who-has 10.10.101.204 tell 10.10.1.69, length 46
15:19:46.609395 ARP, Request who-has 10.10.102.204 tell 10.10.1.69, length 46
15:19:46.609412 ARP, Request who-has 10.10.103.204 tell 10.10.1.69, length 46
15:19:46.609414 ARP, Request who-has 10.10.104.204 tell 10.10.1.69, length 46
15:19:46.703840 IP lenovo-001.58679 > dns.google.domain: 58485+ [1au] PTR? 203.111.10.10.in-addr.arpa. (55)
15:19:46.746217 IP dns.google.domain > lenovo-001.58679: 58485 NXDomain 0/0/1 (55)
15:19:46.746341 IP lenovo-001.58679 > dns.google.domain: 58485+ PTR? 203.111.10.10.in-addr.arpa. (44)
15:19:46.763571 IP dns.google.domain > lenovo-001.58679: 58485 NXDomain 0/0/0 (44)
15:19:46.763978 IP lenovo-001.59700 > dns.google.domain: 42512+ [1au] PTR? 69.1.10.10.in-addr.arpa. (52)
15:19:46.809764 ARP, Request who-has 10.10.109.204 tell 10.10.1.69, length 46
15:19:46.809769 ARP, Request who-has 10.10.110.204 tell 10.10.1.69, length 46
15:19:46.809770 ARP, Request who-has 10.10.111.204 tell 10.10.1.69, length 46
15:19:46.809770 ARP, Request who-has 10.10.96.205 tell 10.10.1.69, length 46
15:19:46.809771 ARP, Request who-has 10.10.97.205 tell 10.10.1.69, length 46
15:19:46.809771 ARP, Request who-has 10.10.98.205 tell 10.10.1.69, length 46
15:19:46.809797 ARP, Request who-has 10.10.99.205 tell 10.10.1.69, length 46
15:19:46.809797 ARP, Request who-has 10.10.100.205 tell 10.10.1.69, length 46
15:19:46.809797 ARP, Request who-has 10.10.101.205 tell 10.10.1.69, length 46
15:19:46.809798 ARP, Request who-has 10.10.102.205 tell 10.10.1.69, length 46
15:19:46.815500 IP dns.google.domain > lenovo-001.59700: 42512 NXDomain 0/0/1 (52)
15:19:46.815582 IP lenovo-001.59700 > dns.google.domain: 42512+ PTR? 69.1.10.10.in-addr.arpa. (41)
15:19:46.833717 IP dns.google.domain > lenovo-001.59700: 42512 NXDomain 0/0/0 (41)
15:19:46.834035 IP lenovo-001.44916 > dns.google.domain: 18661+ [1au] PTR? 204.96.10.10.in-addr.arpa. (54)
15:19:46.853017 IP dns.google.domain > lenovo-001.44916: 18661 NXDomain 0/0/1 (54)
15:19:46.853065 IP lenovo-001.44916 > dns.google.domain: 18661+ PTR? 204.96.10.10.in-addr.arpa. (43)
15:19:46.870561 IP dns.google.domain > lenovo-001.44916: 18661 NXDomain 0/0/0 (43)
15:19:46.870906 IP lenovo-001.55908 > dns.google.domain: 47953+ [1au] PTR? 204.97.10.10.in-addr.arpa. (54)
15:19:46.887965 IP dns.google.domain > lenovo-001.55908: 47953 NXDomain 0/0/1 (54)
15:19:46.888076 IP lenovo-001.55908 > dns.google.domain: 47953+ PTR? 204.97.10.10.in-addr.arpa. (43)
15:19:46.904053 IP dns.google.domain > lenovo-001.55908: 47953 NXDomain 0/0/0 (43)
15:19:46.904407 IP lenovo-001.32993 > dns.google.domain: 33565+ [1au] PTR? 204.98.10.10.in-addr.arpa. (54)
15:19:46.921503 IP dns.google.domain > lenovo-001.32993: 33565 NXDomain 0/0/1 (54)
15:19:46.921540 IP lenovo-001.32993 > dns.google.domain: 33565+ PTR? 204.98.10.10.in-addr.arpa. (43)
15:19:46.937912 IP dns.google.domain > lenovo-001.32993: 33565 NXDomain 0/0/0 (43)
15:19:46.938155 IP lenovo-001.60580 > dns.google.domain: 20169+ [1au] PTR? 204.99.10.10.in-addr.arpa. (54)
15:19:46.956929 IP dns.google.domain > lenovo-001.60580: 20169 NXDomain 0/0/1 (54)
15:19:46.957026 IP lenovo-001.60580 > dns.google.domain: 20169+ PTR? 204.99.10.10.in-addr.arpa. (43)
15:19:46.975410 IP dns.google.domain > lenovo-001.60580: 20169 NXDomain 0/0/0 (43)
15:19:46.975847 IP lenovo-001.51681 > dns.google.domain: 57194+ [1au] PTR? 204.100.10.10.in-addr.arpa. (55)
15:19:46.994620 IP dns.google.domain > lenovo-001.51681: 57194 NXDomain 0/0/1 (55)
15:19:46.994739 IP lenovo-001.51681 > dns.google.domain: 57194+ PTR? 204.100.10.10.in-addr.arpa. (44)
15:19:47.010487 ARP, Request who-has 10.10.109.204 tell 10.10.1.69, length 46
15:19:47.010503 ARP, Request who-has 10.10.110.204 tell 10.10.1.69, length 46
15:19:47.010504 ARP, Request who-has 10.10.111.204 tell 10.10.1.69, length 46
15:19:47.010504 ARP, Request who-has 10.10.96.205 tell 10.10.1.69, length 46
15:19:47.010504 ARP, Request who-has 10.10.97.205 tell 10.10.1.69, length 46
15:19:47.010505 ARP, Request who-has 10.10.98.205 tell 10.10.1.69, length 46
15:19:47.010505 ARP, Request who-has 10.10.99.205 tell 10.10.1.69, length 46
15:19:47.010505 ARP, Request who-has 10.10.100.205 tell 10.10.1.69, length 46
15:19:47.010511 ARP, Request who-has 10.10.101.205 tell 10.10.1.69, length 46
15:19:47.010511 ARP, Request who-has 10.10.102.205 tell 10.10.1.69, length 46
15:19:47.013061 IP dns.google.domain > lenovo-001.51681: 57194 NXDomain 0/0/0 (44)
15:19:47.013572 IP lenovo-001.45795 > dns.google.domain: 49352+ [1au] PTR? 204.101.10.10.in-addr.arpa. (55)
15:19:47.031895 IP dns.google.domain > lenovo-001.45795: 49352 NXDomain 0/0/1 (55)
15:19:47.031999 IP lenovo-001.45795 > dns.google.domain: 49352+ PTR? 204.101.10.10.in-addr.arpa. (44)
15:19:47.050132 IP dns.google.domain > lenovo-001.45795: 49352 NXDomain 0/0/0 (44)
15:19:47.050505 IP lenovo-001.41086 > dns.google.domain: 45820+ [1au] PTR? 204.102.10.10.in-addr.arpa. (55)
15:19:47.067061 IP dns.google.domain > lenovo-001.41086: 45820 NXDomain 0/0/1 (55)
15:19:47.067129 IP lenovo-001.41086 > dns.google.domain: 45820+ PTR? 204.102.10.10.in-addr.arpa. (44)
15:19:47.083191 IP dns.google.domain > lenovo-001.41086: 45820 NXDomain 0/0/0 (44)
15:19:47.083689 IP lenovo-001.55718 > dns.google.domain: 55097+ [1au] PTR? 204.103.10.10.in-addr.arpa. (55)
15:19:47.102991 IP dns.google.domain > lenovo-001.55718: 55097 NXDomain 0/0/1 (55)
15:19:47.103108 IP lenovo-001.55718 > dns.google.domain: 55097+ PTR? 204.103.10.10.in-addr.arpa. (44)
15:19:47.121971 IP dns.google.domain > lenovo-001.55718: 55097 NXDomain 0/0/0 (44)
15:19:47.122506 IP lenovo-001.39800 > dns.google.domain: 30988+ [1au] PTR? 204.104.10.10.in-addr.arpa. (55)
15:19:47.142207 IP dns.google.domain > lenovo-001.39800: 30988 NXDomain 0/0/1 (55)
15:19:47.142333 IP lenovo-001.39800 > dns.google.domain: 30988+ PTR? 204.104.10.10.in-addr.arpa. (44)
15:19:47.160248 IP dns.google.domain > lenovo-001.39800: 30988 NXDomain 0/0/0 (44)
15:19:47.160775 IP lenovo-001.48434 > dns.google.domain: 55264+ [1au] PTR? 105.1.10.10.in-addr.arpa. (53)
15:19:47.178535 IP dns.google.domain > lenovo-001.48434: 55264 NXDomain 0/0/1 (53)
15:19:47.178654 IP lenovo-001.48434 > dns.google.domain: 55264+ PTR? 105.1.10.10.in-addr.arpa. (42)
15:19:47.189385 IP 10.10.1.121.55957 > 255.255.255.255.29810: UDP, length 367
15:19:47.195294 IP dns.google.domain > lenovo-001.48434: 55264 NXDomain 0/0/0 (42)
15:19:47.195777 IP lenovo-001.52939 > dns.google.domain: 39224+ [1au] PTR? 204.109.10.10.in-addr.arpa. (55)
15:19:47.211296 ARP, Request who-has 10.10.107.205 tell 10.10.1.69, length 46
15:19:47.211311 ARP, Request who-has 10.10.108.205 tell 10.10.1.69, length 46
15:19:47.211313 ARP, Request who-has 10.10.109.205 tell 10.10.1.69, length 46
15:19:47.211315 ARP, Request who-has 10.10.110.205 tell 10.10.1.69, length 46
15:19:47.211317 ARP, Request who-has 10.10.111.205 tell 10.10.1.69, length 46
15:19:47.211319 ARP, Request who-has 10.10.96.206 tell 10.10.1.69, length 46
15:19:47.211320 ARP, Request who-has 10.10.97.206 tell 10.10.1.69, length 46
15:19:47.211322 ARP, Request who-has 10.10.98.206 tell 10.10.1.69, length 46
15:19:47.211340 ARP, Request who-has 10.10.99.206 tell 10.10.1.69, length 46
15:19:47.211342 ARP, Request who-has 10.10.100.206 tell 10.10.1.69, length 46
15:19:47.214743 IP dns.google.domain > lenovo-001.52939: 39224 NXDomain 0/0/1 (55)
15:19:47.214840 IP lenovo-001.52939 > dns.google.domain: 39224+ PTR? 204.109.10.10.in-addr.arpa. (44)
15:19:47.232866 IP dns.google.domain > lenovo-001.52939: 39224 NXDomain 0/0/0 (44)
15:19:47.233415 IP lenovo-001.40777 > dns.google.domain: 44426+ [1au] PTR? 204.110.10.10.in-addr.arpa. (55)
15:19:47.238148 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:47.253359 IP dns.google.domain > lenovo-001.40777: 44426 NXDomain 0/0/1 (55)
15:19:47.253463 IP lenovo-001.40777 > dns.google.domain: 44426+ PTR? 204.110.10.10.in-addr.arpa. (44)
15:19:47.272745 IP dns.google.domain > lenovo-001.40777: 44426 NXDomain 0/0/0 (44)
15:19:47.273183 IP lenovo-001.36820 > dns.google.domain: 18969+ [1au] PTR? 204.111.10.10.in-addr.arpa. (55)
15:19:47.292057 IP dns.google.domain > lenovo-001.36820: 18969 NXDomain 0/0/1 (55)
15:19:47.292127 IP lenovo-001.36820 > dns.google.domain: 18969+ PTR? 204.111.10.10.in-addr.arpa. (44)
15:19:47.310413 IP dns.google.domain > lenovo-001.36820: 18969 NXDomain 0/0/0 (44)
15:19:47.310854 IP lenovo-001.33184 > dns.google.domain: 40483+ [1au] PTR? 205.96.10.10.in-addr.arpa. (54)
15:19:47.328323 IP dns.google.domain > lenovo-001.33184: 40483 NXDomain 0/0/1 (54)
15:19:47.328440 IP lenovo-001.33184 > dns.google.domain: 40483+ PTR? 205.96.10.10.in-addr.arpa. (43)
15:19:47.345072 IP dns.google.domain > lenovo-001.33184: 40483 NXDomain 0/0/0 (43)
15:19:47.345485 IP lenovo-001.55370 > dns.google.domain: 31612+ [1au] PTR? 205.97.10.10.in-addr.arpa. (54)
15:19:47.369216 IP dns.google.domain > lenovo-001.55370: 31612 NXDomain 0/0/1 (54)
15:19:47.369295 IP lenovo-001.55370 > dns.google.domain: 31612+ PTR? 205.97.10.10.in-addr.arpa. (43)
15:19:47.385735 IP dns.google.domain > lenovo-001.55370: 31612 NXDomain 0/0/0 (43)
15:19:47.386170 IP lenovo-001.54363 > dns.google.domain: 48307+ [1au] PTR? 205.98.10.10.in-addr.arpa. (54)
15:19:47.405947 IP dns.google.domain > lenovo-001.54363: 48307 NXDomain 0/0/1 (54)
15:19:47.406067 IP lenovo-001.54363 > dns.google.domain: 48307+ PTR? 205.98.10.10.in-addr.arpa. (43)
15:19:47.411992 ARP, Request who-has 10.10.107.205 tell 10.10.1.69, length 46
15:19:47.412007 ARP, Request who-has 10.10.108.205 tell 10.10.1.69, length 46
15:19:47.412009 ARP, Request who-has 10.10.109.205 tell 10.10.1.69, length 46
15:19:47.412011 ARP, Request who-has 10.10.110.205 tell 10.10.1.69, length 46
15:19:47.412013 ARP, Request who-has 10.10.111.205 tell 10.10.1.69, length 46
15:19:47.412015 ARP, Request who-has 10.10.96.206 tell 10.10.1.69, length 46
15:19:47.412016 ARP, Request who-has 10.10.97.206 tell 10.10.1.69, length 46
15:19:47.412018 ARP, Request who-has 10.10.98.206 tell 10.10.1.69, length 46
15:19:47.412035 ARP, Request who-has 10.10.99.206 tell 10.10.1.69, length 46
15:19:47.412037 ARP, Request who-has 10.10.100.206 tell 10.10.1.69, length 46
15:19:47.425711 IP dns.google.domain > lenovo-001.54363: 48307 NXDomain 0/0/0 (43)
15:19:47.426148 IP lenovo-001.57285 > dns.google.domain: 62922+ [1au] PTR? 205.99.10.10.in-addr.arpa. (54)
15:19:47.444977 IP dns.google.domain > lenovo-001.57285: 62922 NXDomain 0/0/1 (54)
15:19:47.445050 IP lenovo-001.57285 > dns.google.domain: 62922+ PTR? 205.99.10.10.in-addr.arpa. (43)
15:19:47.463476 IP dns.google.domain > lenovo-001.57285: 62922 NXDomain 0/0/0 (43)
15:19:47.463901 IP lenovo-001.50766 > dns.google.domain: 16754+ [1au] PTR? 205.100.10.10.in-addr.arpa. (55)
15:19:47.483536 IP dns.google.domain > lenovo-001.50766: 16754 NXDomain 0/0/1 (55)
15:19:47.483623 IP lenovo-001.50766 > dns.google.domain: 16754+ PTR? 205.100.10.10.in-addr.arpa. (44)
15:19:47.502957 IP dns.google.domain > lenovo-001.50766: 16754 NXDomain 0/0/0 (44)
15:19:47.503496 IP lenovo-001.57359 > dns.google.domain: 30163+ [1au] PTR? 205.101.10.10.in-addr.arpa. (55)
15:19:47.521040 IP dns.google.domain > lenovo-001.57359: 30163 NXDomain 0/0/1 (55)
15:19:47.521155 IP lenovo-001.57359 > dns.google.domain: 30163+ PTR? 205.101.10.10.in-addr.arpa. (44)
15:19:47.538057 IP dns.google.domain > lenovo-001.57359: 30163 NXDomain 0/0/0 (44)
15:19:47.538522 IP lenovo-001.38293 > dns.google.domain: 3051+ [1au] PTR? 205.102.10.10.in-addr.arpa. (55)
15:19:47.558440 IP dns.google.domain > lenovo-001.38293: 3051 NXDomain 0/0/1 (55)
15:19:47.558548 IP lenovo-001.38293 > dns.google.domain: 3051+ PTR? 205.102.10.10.in-addr.arpa. (44)
15:19:47.577796 IP dns.google.domain > lenovo-001.38293: 3051 NXDomain 0/0/0 (44)
15:19:47.578552 IP lenovo-001.57820 > dns.google.domain: 53463+ [1au] PTR? 121.1.10.10.in-addr.arpa. (53)
15:19:47.595955 IP dns.google.domain > lenovo-001.57820: 53463 NXDomain 0/0/1 (53)
15:19:47.595990 IP lenovo-001.57820 > dns.google.domain: 53463+ PTR? 121.1.10.10.in-addr.arpa. (42)
15:19:47.612392 ARP, Request who-has 10.10.105.206 tell 10.10.1.69, length 46
15:19:47.612401 ARP, Request who-has 10.10.106.206 tell 10.10.1.69, length 46
15:19:47.612403 ARP, Request who-has 10.10.107.206 tell 10.10.1.69, length 46
15:19:47.612405 ARP, Request who-has 10.10.108.206 tell 10.10.1.69, length 46
15:19:47.612407 ARP, Request who-has 10.10.109.206 tell 10.10.1.69, length 46
15:19:47.612408 ARP, Request who-has 10.10.110.206 tell 10.10.1.69, length 46
15:19:47.612410 ARP, Request who-has 10.10.111.206 tell 10.10.1.69, length 46
15:19:47.612412 ARP, Request who-has 10.10.96.207 tell 10.10.1.69, length 46
15:19:47.612426 ARP, Request who-has 10.10.97.207 tell 10.10.1.69, length 46
15:19:47.612428 ARP, Request who-has 10.10.98.207 tell 10.10.1.69, length 46
15:19:47.612819 IP dns.google.domain > lenovo-001.57820: 53463 NXDomain 0/0/0 (42)
15:19:47.613211 IP lenovo-001.46681 > dns.google.domain: 41565+ [1au] PTR? 205.107.10.10.in-addr.arpa. (55)
15:19:47.631359 IP dns.google.domain > lenovo-001.46681: 41565 NXDomain 0/0/1 (55)
15:19:47.631420 IP lenovo-001.46681 > dns.google.domain: 41565+ PTR? 205.107.10.10.in-addr.arpa. (44)
15:19:47.649232 IP dns.google.domain > lenovo-001.46681: 41565 NXDomain 0/0/0 (44)
15:19:47.649666 IP lenovo-001.44724 > dns.google.domain: 22774+ [1au] PTR? 205.108.10.10.in-addr.arpa. (55)
15:19:47.666555 IP dns.google.domain > lenovo-001.44724: 22774 NXDomain 0/0/1 (55)
15:19:47.666652 IP lenovo-001.44724 > dns.google.domain: 22774+ PTR? 205.108.10.10.in-addr.arpa. (44)
15:19:47.683162 IP dns.google.domain > lenovo-001.44724: 22774 NXDomain 0/0/0 (44)
15:19:47.683589 IP lenovo-001.33864 > dns.google.domain: 18964+ [1au] PTR? 205.109.10.10.in-addr.arpa. (55)
15:19:47.701670 IP dns.google.domain > lenovo-001.33864: 18964 NXDomain 0/0/1 (55)
15:19:47.701777 IP lenovo-001.33864 > dns.google.domain: 18964+ PTR? 205.109.10.10.in-addr.arpa. (44)
15:19:47.719193 IP dns.google.domain > lenovo-001.33864: 18964 NXDomain 0/0/0 (44)
15:19:47.719655 IP lenovo-001.46329 > dns.google.domain: 1960+ [1au] PTR? 205.110.10.10.in-addr.arpa. (55)
15:19:47.736981 IP dns.google.domain > lenovo-001.46329: 1960 NXDomain 0/0/1 (55)
15:19:47.737088 IP lenovo-001.46329 > dns.google.domain: 1960+ PTR? 205.110.10.10.in-addr.arpa. (44)
15:19:47.753180 IP dns.google.domain > lenovo-001.46329: 1960 NXDomain 0/0/0 (44)
15:19:47.753624 IP lenovo-001.34940 > dns.google.domain: 43977+ [1au] PTR? 205.111.10.10.in-addr.arpa. (55)
15:19:47.773160 IP dns.google.domain > lenovo-001.34940: 43977 NXDomain 0/0/1 (55)
15:19:47.773285 IP lenovo-001.34940 > dns.google.domain: 43977+ PTR? 205.111.10.10.in-addr.arpa. (44)
15:19:47.791621 IP dns.google.domain > lenovo-001.34940: 43977 NXDomain 0/0/0 (44)
15:19:47.792055 IP lenovo-001.35544 > dns.google.domain: 49091+ [1au] PTR? 206.96.10.10.in-addr.arpa. (54)
15:19:47.810232 IP dns.google.domain > lenovo-001.35544: 49091 NXDomain 0/0/1 (54)
15:19:47.810360 IP lenovo-001.35544 > dns.google.domain: 49091+ PTR? 206.96.10.10.in-addr.arpa. (43)
15:19:47.813178 ARP, Request who-has 10.10.105.206 tell 10.10.1.69, length 46
15:19:47.813194 ARP, Request who-has 10.10.106.206 tell 10.10.1.69, length 46
15:19:47.813196 ARP, Request who-has 10.10.107.206 tell 10.10.1.69, length 46
15:19:47.813198 ARP, Request who-has 10.10.108.206 tell 10.10.1.69, length 46
15:19:47.813199 ARP, Request who-has 10.10.109.206 tell 10.10.1.69, length 46
15:19:47.813201 ARP, Request who-has 10.10.110.206 tell 10.10.1.69, length 46
15:19:47.813203 ARP, Request who-has 10.10.111.206 tell 10.10.1.69, length 46
15:19:47.813205 ARP, Request who-has 10.10.96.207 tell 10.10.1.69, length 46
15:19:47.813222 ARP, Request who-has 10.10.97.207 tell 10.10.1.69, length 46
15:19:47.813224 ARP, Request who-has 10.10.98.207 tell 10.10.1.69, length 46
15:19:47.827582 IP dns.google.domain > lenovo-001.35544: 49091 NXDomain 0/0/0 (43)
15:19:47.828003 IP lenovo-001.51348 > dns.google.domain: 50424+ [1au] PTR? 206.97.10.10.in-addr.arpa. (54)
15:19:47.844977 IP dns.google.domain > lenovo-001.51348: 50424 NXDomain 0/0/1 (54)
15:19:47.845050 IP lenovo-001.51348 > dns.google.domain: 50424+ PTR? 206.97.10.10.in-addr.arpa. (43)
15:19:47.861627 IP dns.google.domain > lenovo-001.51348: 50424 NXDomain 0/0/0 (43)
15:19:47.862074 IP lenovo-001.54511 > dns.google.domain: 42582+ [1au] PTR? 206.98.10.10.in-addr.arpa. (54)
15:19:47.880579 IP dns.google.domain > lenovo-001.54511: 42582 NXDomain 0/0/1 (54)
15:19:47.880697 IP lenovo-001.54511 > dns.google.domain: 42582+ PTR? 206.98.10.10.in-addr.arpa. (43)
15:19:47.898748 IP dns.google.domain > lenovo-001.54511: 42582 NXDomain 0/0/0 (43)
15:19:47.899042 IP lenovo-001.43101 > dns.google.domain: 46029+ [1au] PTR? 206.99.10.10.in-addr.arpa. (54)
15:19:47.914873 IP dns.google.domain > lenovo-001.43101: 46029 NXDomain 0/0/1 (54)
15:19:47.914982 IP lenovo-001.43101 > dns.google.domain: 46029+ PTR? 206.99.10.10.in-addr.arpa. (43)
15:19:47.930943 IP dns.google.domain > lenovo-001.43101: 46029 NXDomain 0/0/0 (43)
15:19:47.931372 IP lenovo-001.50960 > dns.google.domain: 22224+ [1au] PTR? 206.100.10.10.in-addr.arpa. (55)
15:19:47.970662 IP lenovo-001.60921 > dns.google.domain: 57217+ [1au] PTR? 5.1.10.10.in-addr.arpa. (51)
15:19:47.989280 IP dns.google.domain > lenovo-001.60921: 57217 NXDomain 0/0/1 (51)
15:19:47.989356 IP lenovo-001.60921 > dns.google.domain: 57217+ PTR? 5.1.10.10.in-addr.arpa. (40)
15:19:48.007271 IP dns.google.domain > lenovo-001.60921: 57217 NXDomain 0/0/0 (40)
15:19:48.007627 IP lenovo-001.50696 > dns.google.domain: 7638+ [1au] PTR? 2.1.10.10.in-addr.arpa. (51)
15:19:48.013829 ARP, Request who-has 10.10.103.207 tell 10.10.1.69, length 46
15:19:48.013840 ARP, Request who-has 10.10.104.207 tell 10.10.1.69, length 46
15:19:48.013842 ARP, Request who-has 10.10.105.207 tell 10.10.1.69, length 46
15:19:48.013844 ARP, Request who-has 10.10.106.207 tell 10.10.1.69, length 46
15:19:48.013845 ARP, Request who-has 10.10.107.207 tell 10.10.1.69, length 46
15:19:48.013847 ARP, Request who-has 10.10.108.207 tell 10.10.1.69, length 46
15:19:48.013849 ARP, Request who-has 10.10.109.207 tell 10.10.1.69, length 46
15:19:48.013850 ARP, Request who-has 10.10.110.207 tell 10.10.1.69, length 46
15:19:48.013865 ARP, Request who-has 10.10.111.207 tell 10.10.1.69, length 46
15:19:48.013867 ARP, Request who-has 10.10.96.208 tell 10.10.1.69, length 46
15:19:48.025585 IP dns.google.domain > lenovo-001.50696: 7638 NXDomain 0/0/1 (51)
15:19:48.025684 IP lenovo-001.50696 > dns.google.domain: 7638+ PTR? 2.1.10.10.in-addr.arpa. (40)
15:19:48.042777 IP dns.google.domain > lenovo-001.50696: 7638 NXDomain 0/0/0 (40)
15:19:48.043428 IP lenovo-001.48540 > dns.google.domain: 33917+ [1au] PTR? 206.105.10.10.in-addr.arpa. (55)
15:19:48.060578 IP dns.google.domain > lenovo-001.48540: 33917 NXDomain 0/0/1 (55)
15:19:48.060616 IP lenovo-001.48540 > dns.google.domain: 33917+ PTR? 206.105.10.10.in-addr.arpa. (44)
15:19:48.077217 IP dns.google.domain > lenovo-001.48540: 33917 NXDomain 0/0/0 (44)
15:19:48.077653 IP lenovo-001.60542 > dns.google.domain: 41026+ [1au] PTR? 206.106.10.10.in-addr.arpa. (55)
15:19:48.097429 IP dns.google.domain > lenovo-001.60542: 41026 NXDomain 0/0/1 (55)
15:19:48.097502 IP lenovo-001.60542 > dns.google.domain: 41026+ PTR? 206.106.10.10.in-addr.arpa. (44)
15:19:48.116640 IP dns.google.domain > lenovo-001.60542: 41026 NXDomain 0/0/0 (44)
15:19:48.116980 IP lenovo-001.53212 > dns.google.domain: 20937+ [1au] PTR? 206.107.10.10.in-addr.arpa. (55)
15:19:48.136602 IP dns.google.domain > lenovo-001.53212: 20937 NXDomain 0/0/1 (55)
15:19:48.136690 IP lenovo-001.53212 > dns.google.domain: 20937+ PTR? 206.107.10.10.in-addr.arpa. (44)
15:19:48.155136 IP dns.google.domain > lenovo-001.53212: 20937 NXDomain 0/0/0 (44)
15:19:48.155523 IP lenovo-001.36014 > dns.google.domain: 32229+ [1au] PTR? 206.108.10.10.in-addr.arpa. (55)
15:19:48.173758 IP dns.google.domain > lenovo-001.36014: 32229 NXDomain 0/0/1 (55)
15:19:48.173806 IP lenovo-001.36014 > dns.google.domain: 32229+ PTR? 206.108.10.10.in-addr.arpa. (44)
15:19:48.195856 IP dns.google.domain > lenovo-001.36014: 32229 NXDomain 0/0/0 (44)
15:19:48.196188 IP lenovo-001.34975 > dns.google.domain: 23171+ [1au] PTR? 206.109.10.10.in-addr.arpa. (55)
15:19:48.214507 ARP, Request who-has 10.10.103.207 tell 10.10.1.69, length 46
15:19:48.214519 ARP, Request who-has 10.10.104.207 tell 10.10.1.69, length 46
15:19:48.214521 ARP, Request who-has 10.10.105.207 tell 10.10.1.69, length 46
15:19:48.214522 ARP, Request who-has 10.10.106.207 tell 10.10.1.69, length 46
15:19:48.214524 ARP, Request who-has 10.10.107.207 tell 10.10.1.69, length 46
15:19:48.214526 ARP, Request who-has 10.10.108.207 tell 10.10.1.69, length 46
15:19:48.214527 ARP, Request who-has 10.10.109.207 tell 10.10.1.69, length 46
15:19:48.214529 ARP, Request who-has 10.10.110.207 tell 10.10.1.69, length 46
15:19:48.214544 ARP, Request who-has 10.10.111.207 tell 10.10.1.69, length 46
15:19:48.214546 ARP, Request who-has 10.10.96.208 tell 10.10.1.69, length 46
15:19:48.217096 IP dns.google.domain > lenovo-001.34975: 23171 NXDomain 0/0/1 (55)
15:19:48.217183 IP lenovo-001.34975 > dns.google.domain: 23171+ PTR? 206.109.10.10.in-addr.arpa. (44)
15:19:48.236325 IP dns.google.domain > lenovo-001.34975: 23171 NXDomain 0/0/0 (44)
15:19:48.236706 IP lenovo-001.41186 > dns.google.domain: 43377+ [1au] PTR? 206.110.10.10.in-addr.arpa. (55)
15:19:48.244848 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:48.253803 IP dns.google.domain > lenovo-001.41186: 43377 NXDomain 0/0/1 (55)
15:19:48.253889 IP lenovo-001.41186 > dns.google.domain: 43377+ PTR? 206.110.10.10.in-addr.arpa. (44)
15:19:48.270485 IP dns.google.domain > lenovo-001.41186: 43377 NXDomain 0/0/0 (44)
15:19:48.270886 IP lenovo-001.57233 > dns.google.domain: 32611+ [1au] PTR? 206.111.10.10.in-addr.arpa. (55)
15:19:48.290936 IP dns.google.domain > lenovo-001.57233: 32611 NXDomain 0/0/1 (55)
15:19:48.291050 IP lenovo-001.57233 > dns.google.domain: 32611+ PTR? 206.111.10.10.in-addr.arpa. (44)
15:19:48.310724 IP dns.google.domain > lenovo-001.57233: 32611 NXDomain 0/0/0 (44)
15:19:48.311158 IP lenovo-001.39287 > dns.google.domain: 8075+ [1au] PTR? 207.96.10.10.in-addr.arpa. (54)
15:19:48.327892 IP dns.google.domain > lenovo-001.39287: 8075 NXDomain 0/0/1 (54)
15:19:48.328011 IP lenovo-001.39287 > dns.google.domain: 8075+ PTR? 207.96.10.10.in-addr.arpa. (43)
15:19:48.344476 IP dns.google.domain > lenovo-001.39287: 8075 NXDomain 0/0/0 (43)
15:19:48.344936 IP lenovo-001.56610 > dns.google.domain: 64052+ [1au] PTR? 207.97.10.10.in-addr.arpa. (54)
15:19:48.364415 IP dns.google.domain > lenovo-001.56610: 64052 NXDomain 0/0/1 (54)
15:19:48.364475 IP lenovo-001.56610 > dns.google.domain: 64052+ PTR? 207.97.10.10.in-addr.arpa. (43)
15:19:48.382370 IP dns.google.domain > lenovo-001.56610: 64052 NXDomain 0/0/0 (43)
15:19:48.382824 IP lenovo-001.54181 > dns.google.domain: 13429+ [1au] PTR? 207.98.10.10.in-addr.arpa. (54)
15:19:48.418675 IP lenovo-001.40168 > dns.google.domain: 51271+ [1au] PTR? 207.103.10.10.in-addr.arpa. (55)
15:19:48.435388 IP dns.google.domain > lenovo-001.40168: 51271 NXDomain 0/0/1 (55)
15:19:48.435473 IP lenovo-001.40168 > dns.google.domain: 51271+ PTR? 207.103.10.10.in-addr.arpa. (44)
15:19:48.451076 IP dns.google.domain > lenovo-001.40168: 51271 NXDomain 0/0/0 (44)
15:19:48.451398 IP lenovo-001.56082 > dns.google.domain: 55128+ [1au] PTR? 207.104.10.10.in-addr.arpa. (55)
15:19:48.470031 IP dns.google.domain > lenovo-001.56082: 55128 NXDomain 0/0/1 (55)
15:19:48.470078 IP lenovo-001.56082 > dns.google.domain: 55128+ PTR? 207.104.10.10.in-addr.arpa. (44)
15:19:48.488265 IP dns.google.domain > lenovo-001.56082: 55128 NXDomain 0/0/0 (44)
15:19:48.488649 IP lenovo-001.45017 > dns.google.domain: 46010+ [1au] PTR? 207.105.10.10.in-addr.arpa. (55)
15:19:48.506221 IP dns.google.domain > lenovo-001.45017: 46010 NXDomain 0/0/1 (55)
15:19:48.506320 IP lenovo-001.45017 > dns.google.domain: 46010+ PTR? 207.105.10.10.in-addr.arpa. (44)
15:19:48.521503 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:19:48.523069 IP dns.google.domain > lenovo-001.45017: 46010 NXDomain 0/0/0 (44)
15:19:48.523521 IP lenovo-001.59537 > dns.google.domain: 46376+ [1au] PTR? 207.106.10.10.in-addr.arpa. (55)
15:19:48.543288 IP dns.google.domain > lenovo-001.59537: 46376 NXDomain 0/0/1 (55)
15:19:48.543395 IP lenovo-001.59537 > dns.google.domain: 46376+ PTR? 207.106.10.10.in-addr.arpa. (44)
15:19:48.552831 ARP, Request who-has 10.10.1.74 tell 10.10.1.119, length 46
15:19:48.562330 IP dns.google.domain > lenovo-001.59537: 46376 NXDomain 0/0/0 (44)
15:19:48.562767 IP lenovo-001.36672 > dns.google.domain: 41884+ [1au] PTR? 207.107.10.10.in-addr.arpa. (55)
15:19:48.578427 ARP, Request who-has 10.10.1.72 tell _gateway, length 46
15:19:48.582713 IP dns.google.domain > lenovo-001.36672: 41884 NXDomain 0/0/1 (55)
15:19:48.582830 IP lenovo-001.36672 > dns.google.domain: 41884+ PTR? 207.107.10.10.in-addr.arpa. (44)
15:19:48.602461 IP dns.google.domain > lenovo-001.36672: 41884 NXDomain 0/0/0 (44)
15:19:48.602880 IP lenovo-001.45881 > dns.google.domain: 21223+ [1au] PTR? 207.108.10.10.in-addr.arpa. (55)
15:19:48.615942 ARP, Request who-has 10.10.101.208 tell 10.10.1.69, length 46
15:19:48.615957 ARP, Request who-has 10.10.102.208 tell 10.10.1.69, length 46
15:19:48.615959 ARP, Request who-has 10.10.103.208 tell 10.10.1.69, length 46
15:19:48.615961 ARP, Request who-has 10.10.104.208 tell 10.10.1.69, length 46
15:19:48.615962 ARP, Request who-has 10.10.105.208 tell 10.10.1.69, length 46
15:19:48.615964 ARP, Request who-has 10.10.106.208 tell 10.10.1.69, length 46
15:19:48.615966 ARP, Request who-has 10.10.107.208 tell 10.10.1.69, length 46
15:19:48.615967 ARP, Request who-has 10.10.108.208 tell 10.10.1.69, length 46
15:19:48.615985 ARP, Request who-has 10.10.109.208 tell 10.10.1.69, length 46
15:19:48.615987 ARP, Request who-has 10.10.110.208 tell 10.10.1.69, length 46
15:19:48.621162 IP dns.google.domain > lenovo-001.45881: 21223 NXDomain 0/0/1 (55)
15:19:48.621292 IP lenovo-001.45881 > dns.google.domain: 21223+ PTR? 207.108.10.10.in-addr.arpa. (44)
15:19:48.638323 IP dns.google.domain > lenovo-001.45881: 21223 NXDomain 0/0/0 (44)
15:19:48.638680 IP lenovo-001.47663 > dns.google.domain: 5704+ [1au] PTR? 207.109.10.10.in-addr.arpa. (55)
15:19:48.657187 IP dns.google.domain > lenovo-001.47663: 5704 NXDomain 0/0/1 (55)
15:19:48.657311 IP lenovo-001.47663 > dns.google.domain: 5704+ PTR? 207.109.10.10.in-addr.arpa. (44)
15:19:48.674702 IP dns.google.domain > lenovo-001.47663: 5704 NXDomain 0/0/0 (44)
15:19:48.675155 IP lenovo-001.49041 > dns.google.domain: 31114+ [1au] PTR? 207.110.10.10.in-addr.arpa. (55)
15:19:48.693184 IP dns.google.domain > lenovo-001.49041: 31114 NXDomain 0/0/1 (55)
15:19:48.693263 IP lenovo-001.49041 > dns.google.domain: 31114+ PTR? 207.110.10.10.in-addr.arpa. (44)
15:19:48.710555 IP dns.google.domain > lenovo-001.49041: 31114 NXDomain 0/0/0 (44)
15:19:48.711012 IP lenovo-001.40875 > dns.google.domain: 25234+ [1au] PTR? 207.111.10.10.in-addr.arpa. (55)
15:19:48.731019 IP dns.google.domain > lenovo-001.40875: 25234 NXDomain 0/0/1 (55)
15:19:48.731135 IP lenovo-001.40875 > dns.google.domain: 25234+ PTR? 207.111.10.10.in-addr.arpa. (44)
15:19:48.750512 IP dns.google.domain > lenovo-001.40875: 25234 NXDomain 0/0/0 (44)
15:19:48.750941 IP lenovo-001.38160 > dns.google.domain: 35713+ [1au] PTR? 208.96.10.10.in-addr.arpa. (54)
15:19:48.769185 IP dns.google.domain > lenovo-001.38160: 35713 NXDomain 0/0/1 (54)
15:19:48.769293 IP lenovo-001.38160 > dns.google.domain: 35713+ PTR? 208.96.10.10.in-addr.arpa. (43)
15:19:48.786574 IP dns.google.domain > lenovo-001.38160: 35713 NXDomain 0/0/0 (43)
15:19:48.787204 IP lenovo-001.36437 > dns.google.domain: 47790+ [1au] PTR? 74.1.10.10.in-addr.arpa. (52)
15:19:48.807010 IP dns.google.domain > lenovo-001.36437: 47790 NXDomain 0/0/1 (52)
15:19:48.807084 IP lenovo-001.36437 > dns.google.domain: 47790+ PTR? 74.1.10.10.in-addr.arpa. (41)
15:19:48.816430 ARP, Request who-has 10.10.99.209 tell 10.10.1.69, length 46
15:19:48.816438 ARP, Request who-has 10.10.100.209 tell 10.10.1.69, length 46
15:19:48.816440 ARP, Request who-has 10.10.101.209 tell 10.10.1.69, length 46
15:19:48.816441 ARP, Request who-has 10.10.102.209 tell 10.10.1.69, length 46
15:19:48.816443 ARP, Request who-has 10.10.103.209 tell 10.10.1.69, length 46
15:19:48.816445 ARP, Request who-has 10.10.104.209 tell 10.10.1.69, length 46
15:19:48.816446 ARP, Request who-has 10.10.105.209 tell 10.10.1.69, length 46
15:19:48.816485 ARP, Request who-has 10.10.106.209 tell 10.10.1.69, length 46
15:19:48.816487 ARP, Request who-has 10.10.107.209 tell 10.10.1.69, length 46
15:19:48.816488 ARP, Request who-has 10.10.108.209 tell 10.10.1.69, length 46
15:19:48.826099 IP 10.10.1.122.39323 > 255.255.255.255.29810: UDP, length 367
15:19:48.826331 IP dns.google.domain > lenovo-001.36437: 47790 NXDomain 0/0/0 (41)
15:19:48.826547 IP lenovo-001.44182 > dns.google.domain: 16693+ [1au] PTR? 119.1.10.10.in-addr.arpa. (53)
15:19:48.846310 IP dns.google.domain > lenovo-001.44182: 16693 NXDomain 0/0/1 (53)
15:19:48.846371 IP lenovo-001.44182 > dns.google.domain: 16693+ PTR? 119.1.10.10.in-addr.arpa. (42)
15:19:48.865021 IP dns.google.domain > lenovo-001.44182: 16693 NXDomain 0/0/0 (42)
15:19:48.865446 IP lenovo-001.48840 > dns.google.domain: 36477+ [1au] PTR? 72.1.10.10.in-addr.arpa. (52)
15:19:48.883663 IP dns.google.domain > lenovo-001.48840: 36477 NXDomain 0/0/1 (52)
15:19:48.883787 IP lenovo-001.48840 > dns.google.domain: 36477+ PTR? 72.1.10.10.in-addr.arpa. (41)
15:19:48.901509 IP dns.google.domain > lenovo-001.48840: 36477 NXDomain 0/0/0 (41)
15:19:48.901977 IP lenovo-001.34984 > dns.google.domain: 48076+ [1au] PTR? 208.101.10.10.in-addr.arpa. (55)
15:19:48.920590 IP dns.google.domain > lenovo-001.34984: 48076 NXDomain 0/0/1 (55)
15:19:48.920705 IP lenovo-001.34984 > dns.google.domain: 48076+ PTR? 208.101.10.10.in-addr.arpa. (44)
15:19:48.938485 IP dns.google.domain > lenovo-001.34984: 48076 NXDomain 0/0/0 (44)
15:19:48.939005 IP lenovo-001.40641 > dns.google.domain: 32900+ [1au] PTR? 208.102.10.10.in-addr.arpa. (55)
15:19:48.956847 IP dns.google.domain > lenovo-001.40641: 32900 NXDomain 0/0/1 (55)
15:19:48.956920 IP lenovo-001.40641 > dns.google.domain: 32900+ PTR? 208.102.10.10.in-addr.arpa. (44)
15:19:48.973925 IP dns.google.domain > lenovo-001.40641: 32900 NXDomain 0/0/0 (44)
15:19:48.974274 IP lenovo-001.60400 > dns.google.domain: 7971+ [1au] PTR? 208.103.10.10.in-addr.arpa. (55)
15:19:48.991035 IP dns.google.domain > lenovo-001.60400: 7971 NXDomain 0/0/1 (55)
15:19:48.991154 IP lenovo-001.60400 > dns.google.domain: 7971+ PTR? 208.103.10.10.in-addr.arpa. (44)
15:19:49.007166 IP dns.google.domain > lenovo-001.60400: 7971 NXDomain 0/0/0 (44)
15:19:49.007546 IP lenovo-001.38391 > dns.google.domain: 14338+ [1au] PTR? 208.104.10.10.in-addr.arpa. (55)
15:19:49.017113 ARP, Request who-has 10.10.99.209 tell 10.10.1.69, length 46
15:19:49.017122 ARP, Request who-has 10.10.100.209 tell 10.10.1.69, length 46
15:19:49.017122 ARP, Request who-has 10.10.101.209 tell 10.10.1.69, length 46
15:19:49.017123 ARP, Request who-has 10.10.102.209 tell 10.10.1.69, length 46
15:19:49.017123 ARP, Request who-has 10.10.103.209 tell 10.10.1.69, length 46
15:19:49.017123 ARP, Request who-has 10.10.104.209 tell 10.10.1.69, length 46
15:19:49.017124 ARP, Request who-has 10.10.105.209 tell 10.10.1.69, length 46
15:19:49.017124 ARP, Request who-has 10.10.106.209 tell 10.10.1.69, length 46
15:19:49.017129 ARP, Request who-has 10.10.107.209 tell 10.10.1.69, length 46
15:19:49.017130 ARP, Request who-has 10.10.108.209 tell 10.10.1.69, length 46
15:19:49.025167 IP dns.google.domain > lenovo-001.38391: 14338 NXDomain 0/0/1 (55)
15:19:49.025289 IP lenovo-001.38391 > dns.google.domain: 14338+ PTR? 208.104.10.10.in-addr.arpa. (44)
15:19:49.042068 IP dns.google.domain > lenovo-001.38391: 14338 NXDomain 0/0/0 (44)
15:19:49.042530 IP lenovo-001.45101 > dns.google.domain: 13811+ [1au] PTR? 208.105.10.10.in-addr.arpa. (55)
15:19:49.060023 IP dns.google.domain > lenovo-001.45101: 13811 NXDomain 0/0/1 (55)
15:19:49.060089 IP lenovo-001.45101 > dns.google.domain: 13811+ PTR? 208.105.10.10.in-addr.arpa. (44)
15:19:49.076956 IP dns.google.domain > lenovo-001.45101: 13811 NXDomain 0/0/0 (44)
15:19:49.077240 IP lenovo-001.56854 > dns.google.domain: 23167+ [1au] PTR? 208.106.10.10.in-addr.arpa. (55)
15:19:49.094670 IP dns.google.domain > lenovo-001.56854: 23167 NXDomain 0/0/1 (55)
15:19:49.094742 IP lenovo-001.56854 > dns.google.domain: 23167+ PTR? 208.106.10.10.in-addr.arpa. (44)
15:19:49.111633 IP dns.google.domain > lenovo-001.56854: 23167 NXDomain 0/0/0 (44)
15:19:49.111952 IP lenovo-001.48953 > dns.google.domain: 20141+ [1au] PTR? 208.107.10.10.in-addr.arpa. (55)
15:19:49.129343 IP dns.google.domain > lenovo-001.48953: 20141 NXDomain 0/0/1 (55)
15:19:49.129504 IP lenovo-001.48953 > dns.google.domain: 20141+ PTR? 208.107.10.10.in-addr.arpa. (44)
15:19:49.146006 IP dns.google.domain > lenovo-001.48953: 20141 NXDomain 0/0/0 (44)
15:19:49.146354 IP lenovo-001.40506 > dns.google.domain: 34433+ [1au] PTR? 208.108.10.10.in-addr.arpa. (55)
15:19:49.165677 IP dns.google.domain > lenovo-001.40506: 34433 NXDomain 0/0/1 (55)
15:19:49.165751 IP lenovo-001.40506 > dns.google.domain: 34433+ PTR? 208.108.10.10.in-addr.arpa. (44)
15:19:49.184954 IP dns.google.domain > lenovo-001.40506: 34433 NXDomain 0/0/0 (44)
15:19:49.185371 IP lenovo-001.41464 > dns.google.domain: 53233+ [1au] PTR? 208.109.10.10.in-addr.arpa. (55)
15:19:49.202795 IP dns.google.domain > lenovo-001.41464: 53233 NXDomain 0/0/1 (55)
15:19:49.202908 IP lenovo-001.41464 > dns.google.domain: 53233+ PTR? 208.109.10.10.in-addr.arpa. (44)
15:19:49.217818 ARP, Request who-has 10.10.97.210 tell 10.10.1.69, length 46
15:19:49.217828 ARP, Request who-has 10.10.98.210 tell 10.10.1.69, length 46
15:19:49.217830 ARP, Request who-has 10.10.99.210 tell 10.10.1.69, length 46
15:19:49.217831 ARP, Request who-has 10.10.100.210 tell 10.10.1.69, length 46
15:19:49.217833 ARP, Request who-has 10.10.101.210 tell 10.10.1.69, length 46
15:19:49.217835 ARP, Request who-has 10.10.102.210 tell 10.10.1.69, length 46
15:19:49.217837 ARP, Request who-has 10.10.103.210 tell 10.10.1.69, length 46
15:19:49.217838 ARP, Request who-has 10.10.104.210 tell 10.10.1.69, length 46
15:19:49.217852 ARP, Request who-has 10.10.105.210 tell 10.10.1.69, length 46
15:19:49.217854 ARP, Request who-has 10.10.106.210 tell 10.10.1.69, length 46
15:19:49.219733 IP dns.google.domain > lenovo-001.41464: 53233 NXDomain 0/0/0 (44)
15:19:49.220141 IP lenovo-001.42598 > dns.google.domain: 28960+ [1au] PTR? 208.110.10.10.in-addr.arpa. (55)
15:19:49.240078 IP dns.google.domain > lenovo-001.42598: 28960 NXDomain 0/0/1 (55)
15:19:49.240182 IP lenovo-001.42598 > dns.google.domain: 28960+ PTR? 208.110.10.10.in-addr.arpa. (44)
15:19:49.248196 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:49.258179 IP dns.google.domain > lenovo-001.42598: 28960 NXDomain 0/0/0 (44)
15:19:49.258713 IP lenovo-001.44039 > dns.google.domain: 6724+ [1au] PTR? 209.99.10.10.in-addr.arpa. (54)
15:19:49.276273 IP dns.google.domain > lenovo-001.44039: 6724 NXDomain 0/0/1 (54)
15:19:49.276357 IP lenovo-001.44039 > dns.google.domain: 6724+ PTR? 209.99.10.10.in-addr.arpa. (43)
15:19:49.293155 IP dns.google.domain > lenovo-001.44039: 6724 NXDomain 0/0/0 (43)
15:19:49.293556 IP lenovo-001.58307 > dns.google.domain: 27030+ [1au] PTR? 209.100.10.10.in-addr.arpa. (55)
15:19:49.312129 IP dns.google.domain > lenovo-001.58307: 27030 NXDomain 0/0/1 (55)
15:19:49.312251 IP lenovo-001.58307 > dns.google.domain: 27030+ PTR? 209.100.10.10.in-addr.arpa. (44)
15:19:49.329945 IP dns.google.domain > lenovo-001.58307: 27030 NXDomain 0/0/0 (44)
15:19:49.330432 IP lenovo-001.42926 > dns.google.domain: 15123+ [1au] PTR? 209.101.10.10.in-addr.arpa. (55)
15:19:49.348623 IP dns.google.domain > lenovo-001.42926: 15123 NXDomain 0/0/1 (55)
15:19:49.348741 IP lenovo-001.42926 > dns.google.domain: 15123+ PTR? 209.101.10.10.in-addr.arpa. (44)
15:19:49.366156 IP dns.google.domain > lenovo-001.42926: 15123 NXDomain 0/0/0 (44)
15:19:49.366608 IP lenovo-001.47646 > dns.google.domain: 53836+ [1au] PTR? 209.102.10.10.in-addr.arpa. (55)
15:19:49.384463 IP dns.google.domain > lenovo-001.47646: 53836 NXDomain 0/0/1 (55)
15:19:49.384539 IP lenovo-001.47646 > dns.google.domain: 53836+ PTR? 209.102.10.10.in-addr.arpa. (44)
15:19:49.401324 IP dns.google.domain > lenovo-001.47646: 53836 NXDomain 0/0/0 (44)
15:19:49.401760 IP lenovo-001.36926 > dns.google.domain: 24976+ [1au] PTR? 209.103.10.10.in-addr.arpa. (55)
15:19:49.418661 ARP, Request who-has 10.10.97.210 tell 10.10.1.69, length 46
15:19:49.418676 ARP, Request who-has 10.10.98.210 tell 10.10.1.69, length 46
15:19:49.418678 ARP, Request who-has 10.10.99.210 tell 10.10.1.69, length 46
15:19:49.418680 ARP, Request who-has 10.10.100.210 tell 10.10.1.69, length 46
15:19:49.418682 ARP, Request who-has 10.10.101.210 tell 10.10.1.69, length 46
15:19:49.418684 ARP, Request who-has 10.10.102.210 tell 10.10.1.69, length 46
15:19:49.418685 ARP, Request who-has 10.10.103.210 tell 10.10.1.69, length 46
15:19:49.418687 ARP, Request who-has 10.10.104.210 tell 10.10.1.69, length 46
15:19:49.418707 ARP, Request who-has 10.10.105.210 tell 10.10.1.69, length 46
15:19:49.418709 ARP, Request who-has 10.10.106.210 tell 10.10.1.69, length 46
15:19:49.421684 IP dns.google.domain > lenovo-001.36926: 24976 NXDomain 0/0/1 (55)
15:19:49.421766 IP lenovo-001.36926 > dns.google.domain: 24976+ PTR? 209.103.10.10.in-addr.arpa. (44)
15:19:49.440694 IP dns.google.domain > lenovo-001.36926: 24976 NXDomain 0/0/0 (44)
15:19:49.441130 IP lenovo-001.52691 > dns.google.domain: 12362+ [1au] PTR? 209.104.10.10.in-addr.arpa. (55)
15:19:49.460850 IP dns.google.domain > lenovo-001.52691: 12362 NXDomain 0/0/1 (55)
15:19:49.460966 IP lenovo-001.52691 > dns.google.domain: 12362+ PTR? 209.104.10.10.in-addr.arpa. (44)
15:19:49.480061 IP dns.google.domain > lenovo-001.52691: 12362 NXDomain 0/0/0 (44)
15:19:49.480508 IP lenovo-001.51329 > dns.google.domain: 12152+ [1au] PTR? 209.105.10.10.in-addr.arpa. (55)
15:19:49.499025 IP dns.google.domain > lenovo-001.51329: 12152 NXDomain 0/0/1 (55)
15:19:49.499145 IP lenovo-001.51329 > dns.google.domain: 12152+ PTR? 209.105.10.10.in-addr.arpa. (44)
15:19:49.516921 IP dns.google.domain > lenovo-001.51329: 12152 NXDomain 0/0/0 (44)
15:19:49.517398 IP lenovo-001.51556 > dns.google.domain: 51671+ [1au] PTR? 209.106.10.10.in-addr.arpa. (55)
15:19:49.535014 IP dns.google.domain > lenovo-001.51556: 51671 NXDomain 0/0/1 (55)
15:19:49.535131 IP lenovo-001.51556 > dns.google.domain: 51671+ PTR? 209.106.10.10.in-addr.arpa. (44)
15:19:49.552439 IP dns.google.domain > lenovo-001.51556: 51671 NXDomain 0/0/0 (44)
15:19:49.552878 IP lenovo-001.60729 > dns.google.domain: 45487+ [1au] PTR? 209.107.10.10.in-addr.arpa. (55)
15:19:49.667464 IP lenovo-001.43191 > dns.google.domain: 355+ [1au] PTR? 210.97.10.10.in-addr.arpa. (54)
15:19:49.685481 IP dns.google.domain > lenovo-001.43191: 355 NXDomain 0/0/1 (54)
15:19:49.685667 IP lenovo-001.43191 > dns.google.domain: 355+ PTR? 210.97.10.10.in-addr.arpa. (43)
15:19:49.702299 IP dns.google.domain > lenovo-001.43191: 355 NXDomain 0/0/0 (43)
15:19:49.702840 IP lenovo-001.42187 > dns.google.domain: 16832+ [1au] PTR? 210.98.10.10.in-addr.arpa. (54)
15:19:49.720040 IP dns.google.domain > lenovo-001.42187: 16832 NXDomain 0/0/1 (54)
15:19:49.720256 IP lenovo-001.42187 > dns.google.domain: 16832+ PTR? 210.98.10.10.in-addr.arpa. (43)
15:19:49.736930 IP dns.google.domain > lenovo-001.42187: 16832 NXDomain 0/0/0 (43)
15:19:49.737423 IP lenovo-001.33094 > dns.google.domain: 40118+ [1au] PTR? 210.99.10.10.in-addr.arpa. (54)
15:19:49.756264 IP dns.google.domain > lenovo-001.33094: 40118 NXDomain 0/0/1 (54)
15:19:49.756435 IP lenovo-001.33094 > dns.google.domain: 40118+ PTR? 210.99.10.10.in-addr.arpa. (43)
15:19:49.774473 IP dns.google.domain > lenovo-001.33094: 40118 NXDomain 0/0/0 (43)
15:19:49.775007 IP lenovo-001.59003 > dns.google.domain: 30039+ [1au] PTR? 210.100.10.10.in-addr.arpa. (55)
15:19:49.791239 IP dns.google.domain > lenovo-001.59003: 30039 NXDomain 0/0/1 (55)
15:19:49.791433 IP lenovo-001.59003 > dns.google.domain: 30039+ PTR? 210.100.10.10.in-addr.arpa. (44)
15:19:49.806518 IP dns.google.domain > lenovo-001.59003: 30039 NXDomain 0/0/0 (44)
15:19:49.806997 IP lenovo-001.47426 > dns.google.domain: 14053+ [1au] PTR? 210.101.10.10.in-addr.arpa. (55)
15:19:49.819936 ARP, Request who-has 10.10.111.210 tell 10.10.1.69, length 46
15:19:49.819940 ARP, Request who-has 10.10.96.211 tell 10.10.1.69, length 46
15:19:49.819940 ARP, Request who-has 10.10.97.211 tell 10.10.1.69, length 46
15:19:49.819941 ARP, Request who-has 10.10.98.211 tell 10.10.1.69, length 46
15:19:49.819941 ARP, Request who-has 10.10.99.211 tell 10.10.1.69, length 46
15:19:49.819942 ARP, Request who-has 10.10.100.211 tell 10.10.1.69, length 46
15:19:49.819942 ARP, Request who-has 10.10.101.211 tell 10.10.1.69, length 46
15:19:49.819942 ARP, Request who-has 10.10.102.211 tell 10.10.1.69, length 46
15:19:49.819947 ARP, Request who-has 10.10.103.211 tell 10.10.1.69, length 46
15:19:49.819947 ARP, Request who-has 10.10.104.211 tell 10.10.1.69, length 46
15:19:49.825697 IP dns.google.domain > lenovo-001.47426: 14053 NXDomain 0/0/1 (55)
15:19:49.825804 IP lenovo-001.47426 > dns.google.domain: 14053+ PTR? 210.101.10.10.in-addr.arpa. (44)
15:19:49.843189 IP dns.google.domain > lenovo-001.47426: 14053 NXDomain 0/0/0 (44)
15:19:49.843599 IP lenovo-001.39721 > dns.google.domain: 16827+ [1au] PTR? 210.102.10.10.in-addr.arpa. (55)
15:19:49.862461 IP dns.google.domain > lenovo-001.39721: 16827 NXDomain 0/0/1 (55)
15:19:49.862614 IP lenovo-001.39721 > dns.google.domain: 16827+ PTR? 210.102.10.10.in-addr.arpa. (44)
15:19:49.880646 IP dns.google.domain > lenovo-001.39721: 16827 NXDomain 0/0/0 (44)
15:19:49.881173 IP lenovo-001.60797 > dns.google.domain: 41431+ [1au] PTR? 210.103.10.10.in-addr.arpa. (55)
15:19:49.899657 IP dns.google.domain > lenovo-001.60797: 41431 NXDomain 0/0/1 (55)
15:19:49.899839 IP lenovo-001.60797 > dns.google.domain: 41431+ PTR? 210.103.10.10.in-addr.arpa. (44)
15:19:49.917544 IP dns.google.domain > lenovo-001.60797: 41431 NXDomain 0/0/0 (44)
15:19:49.918077 IP lenovo-001.35541 > dns.google.domain: 43621+ [1au] PTR? 210.104.10.10.in-addr.arpa. (55)
15:19:49.937404 IP dns.google.domain > lenovo-001.35541: 43621 NXDomain 0/0/1 (55)
15:19:49.937603 IP lenovo-001.35541 > dns.google.domain: 43621+ PTR? 210.104.10.10.in-addr.arpa. (44)
15:19:49.956130 IP dns.google.domain > lenovo-001.35541: 43621 NXDomain 0/0/0 (44)
15:19:49.956717 IP lenovo-001.41001 > dns.google.domain: 6977+ [1au] PTR? 210.105.10.10.in-addr.arpa. (55)
15:19:49.973185 IP dns.google.domain > lenovo-001.41001: 6977 NXDomain 0/0/1 (55)
15:19:49.973398 IP lenovo-001.41001 > dns.google.domain: 6977+ PTR? 210.105.10.10.in-addr.arpa. (44)
15:19:49.989465 IP dns.google.domain > lenovo-001.41001: 6977 NXDomain 0/0/0 (44)
15:19:49.989994 IP lenovo-001.53652 > dns.google.domain: 27926+ [1au] PTR? 210.106.10.10.in-addr.arpa. (55)
15:19:50.006127 IP dns.google.domain > lenovo-001.53652: 27926 NXDomain 0/0/1 (55)
15:19:50.006328 IP lenovo-001.53652 > dns.google.domain: 27926+ PTR? 210.106.10.10.in-addr.arpa. (44)
15:19:50.020593 ARP, Request who-has 10.10.109.211 tell 10.10.1.69, length 46
15:19:50.020607 ARP, Request who-has 10.10.110.211 tell 10.10.1.69, length 46
15:19:50.020609 ARP, Request who-has 10.10.111.211 tell 10.10.1.69, length 46
15:19:50.020610 ARP, Request who-has 10.10.96.212 tell 10.10.1.69, length 46
15:19:50.020612 ARP, Request who-has 10.10.97.212 tell 10.10.1.69, length 46
15:19:50.020614 ARP, Request who-has 10.10.98.212 tell 10.10.1.69, length 46
15:19:50.020616 ARP, Request who-has 10.10.99.212 tell 10.10.1.69, length 46
15:19:50.020617 ARP, Request who-has 10.10.100.212 tell 10.10.1.69, length 46
15:19:50.020633 ARP, Request who-has 10.10.101.212 tell 10.10.1.69, length 46
15:19:50.020635 ARP, Request who-has 10.10.102.212 tell 10.10.1.69, length 46
15:19:50.021876 IP dns.google.domain > lenovo-001.53652: 27926 NXDomain 0/0/0 (44)
15:19:50.022686 IP lenovo-001.41649 > dns.google.domain: 5745+ [1au] PTR? 210.111.10.10.in-addr.arpa. (55)
15:19:50.042499 IP dns.google.domain > lenovo-001.41649: 5745 NXDomain 0/0/1 (55)
15:19:50.042700 IP lenovo-001.41649 > dns.google.domain: 5745+ PTR? 210.111.10.10.in-addr.arpa. (44)
15:19:50.061431 IP dns.google.domain > lenovo-001.41649: 5745 NXDomain 0/0/0 (44)
15:19:50.061822 IP lenovo-001.33919 > dns.google.domain: 49754+ [1au] PTR? 211.96.10.10.in-addr.arpa. (54)
15:19:50.078012 IP dns.google.domain > lenovo-001.33919: 49754 NXDomain 0/0/1 (54)
15:19:50.078120 IP lenovo-001.33919 > dns.google.domain: 49754+ PTR? 211.96.10.10.in-addr.arpa. (43)
15:19:50.093775 IP dns.google.domain > lenovo-001.33919: 49754 NXDomain 0/0/0 (43)
15:19:50.094222 IP lenovo-001.50127 > dns.google.domain: 1023+ [1au] PTR? 211.97.10.10.in-addr.arpa. (54)
15:19:50.112175 IP dns.google.domain > lenovo-001.50127: 1023 NXDomain 0/0/1 (54)
15:19:50.112293 IP lenovo-001.50127 > dns.google.domain: 1023+ PTR? 211.97.10.10.in-addr.arpa. (43)
15:19:50.129118 IP dns.google.domain > lenovo-001.50127: 1023 NXDomain 0/0/0 (43)
15:19:50.129564 IP lenovo-001.37340 > dns.google.domain: 57114+ [1au] PTR? 211.98.10.10.in-addr.arpa. (54)
15:19:50.146521 IP dns.google.domain > lenovo-001.37340: 57114 NXDomain 0/0/1 (54)
15:19:50.146621 IP lenovo-001.37340 > dns.google.domain: 57114+ PTR? 211.98.10.10.in-addr.arpa. (43)
15:19:50.162987 IP dns.google.domain > lenovo-001.37340: 57114 NXDomain 0/0/0 (43)
15:19:50.163414 IP lenovo-001.34996 > dns.google.domain: 40370+ [1au] PTR? 211.99.10.10.in-addr.arpa. (54)
15:19:50.182219 IP dns.google.domain > lenovo-001.34996: 40370 NXDomain 0/0/1 (54)
15:19:50.182340 IP lenovo-001.34996 > dns.google.domain: 40370+ PTR? 211.99.10.10.in-addr.arpa. (43)
15:19:50.200566 IP dns.google.domain > lenovo-001.34996: 40370 NXDomain 0/0/0 (43)
15:19:50.201000 IP lenovo-001.38914 > dns.google.domain: 12354+ [1au] PTR? 211.100.10.10.in-addr.arpa. (55)
15:19:50.219073 IP dns.google.domain > lenovo-001.38914: 12354 NXDomain 0/0/1 (55)
15:19:50.219189 IP lenovo-001.38914 > dns.google.domain: 12354+ PTR? 211.100.10.10.in-addr.arpa. (44)
15:19:50.221495 ARP, Request who-has 10.10.109.211 tell 10.10.1.69, length 46
15:19:50.221511 ARP, Request who-has 10.10.110.211 tell 10.10.1.69, length 46
15:19:50.221513 ARP, Request who-has 10.10.111.211 tell 10.10.1.69, length 46
15:19:50.221515 ARP, Request who-has 10.10.96.212 tell 10.10.1.69, length 46
15:19:50.221517 ARP, Request who-has 10.10.97.212 tell 10.10.1.69, length 46
15:19:50.221518 ARP, Request who-has 10.10.98.212 tell 10.10.1.69, length 46
15:19:50.221520 ARP, Request who-has 10.10.99.212 tell 10.10.1.69, length 46
15:19:50.221522 ARP, Request who-has 10.10.100.212 tell 10.10.1.69, length 46
15:19:50.221539 ARP, Request who-has 10.10.101.212 tell 10.10.1.69, length 46
15:19:50.221541 ARP, Request who-has 10.10.102.212 tell 10.10.1.69, length 46
15:19:50.236438 IP dns.google.domain > lenovo-001.38914: 12354 NXDomain 0/0/0 (44)
15:19:50.236897 IP lenovo-001.54737 > dns.google.domain: 33929+ [1au] PTR? 211.101.10.10.in-addr.arpa. (55)
15:19:50.251872 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:50.254210 IP dns.google.domain > lenovo-001.54737: 33929 NXDomain 0/0/1 (55)
15:19:50.254275 IP lenovo-001.54737 > dns.google.domain: 33929+ PTR? 211.101.10.10.in-addr.arpa. (44)
15:19:50.271358 IP dns.google.domain > lenovo-001.54737: 33929 NXDomain 0/0/0 (44)
15:19:50.271771 IP lenovo-001.46165 > dns.google.domain: 60323+ [1au] PTR? 211.102.10.10.in-addr.arpa. (55)
15:19:50.291651 IP dns.google.domain > lenovo-001.46165: 60323 NXDomain 0/0/1 (55)
15:19:50.291765 IP lenovo-001.46165 > dns.google.domain: 60323+ PTR? 211.102.10.10.in-addr.arpa. (44)
15:19:50.310791 IP dns.google.domain > lenovo-001.46165: 60323 NXDomain 0/0/0 (44)
15:19:50.311206 IP lenovo-001.38481 > dns.google.domain: 23756+ [1au] PTR? 211.103.10.10.in-addr.arpa. (55)
15:19:50.330281 IP dns.google.domain > lenovo-001.38481: 23756 NXDomain 0/0/1 (55)
15:19:50.330398 IP lenovo-001.38481 > dns.google.domain: 23756+ PTR? 211.103.10.10.in-addr.arpa. (44)
15:19:50.348473 IP dns.google.domain > lenovo-001.38481: 23756 NXDomain 0/0/0 (44)
15:19:50.348937 IP lenovo-001.58431 > dns.google.domain: 44468+ [1au] PTR? 211.104.10.10.in-addr.arpa. (55)
15:19:50.371099 IP dns.google.domain > lenovo-001.58431: 44468 NXDomain 0/0/1 (55)
15:19:50.371214 IP lenovo-001.58431 > dns.google.domain: 44468+ PTR? 211.104.10.10.in-addr.arpa. (44)
15:19:50.396407 IP dns.google.domain > lenovo-001.58431: 44468 NXDomain 0/0/0 (44)
15:19:50.396924 IP lenovo-001.46751 > dns.google.domain: 5+ [1au] PTR? 211.109.10.10.in-addr.arpa. (55)
15:19:50.416254 IP dns.google.domain > lenovo-001.46751: 5 NXDomain 0/0/1 (55)
15:19:50.416370 IP lenovo-001.46751 > dns.google.domain: 5+ PTR? 211.109.10.10.in-addr.arpa. (44)
15:19:50.422224 ARP, Request who-has 10.10.107.212 tell 10.10.1.69, length 46
15:19:50.422240 ARP, Request who-has 10.10.108.212 tell 10.10.1.69, length 46
15:19:50.422242 ARP, Request who-has 10.10.109.212 tell 10.10.1.69, length 46
15:19:50.422243 ARP, Request who-has 10.10.110.212 tell 10.10.1.69, length 46
15:19:50.422245 ARP, Request who-has 10.10.111.212 tell 10.10.1.69, length 46
15:19:50.422247 ARP, Request who-has 10.10.96.213 tell 10.10.1.69, length 46
15:19:50.422249 ARP, Request who-has 10.10.97.213 tell 10.10.1.69, length 46
15:19:50.422250 ARP, Request who-has 10.10.98.213 tell 10.10.1.69, length 46
15:19:50.422268 ARP, Request who-has 10.10.99.213 tell 10.10.1.69, length 46
15:19:50.422270 ARP, Request who-has 10.10.100.213 tell 10.10.1.69, length 46
15:19:50.434463 IP dns.google.domain > lenovo-001.46751: 5 NXDomain 0/0/0 (44)
15:19:50.434899 IP lenovo-001.52268 > dns.google.domain: 39954+ [1au] PTR? 211.110.10.10.in-addr.arpa. (55)
15:19:50.452521 IP dns.google.domain > lenovo-001.52268: 39954 NXDomain 0/0/1 (55)
15:19:50.452643 IP lenovo-001.52268 > dns.google.domain: 39954+ PTR? 211.110.10.10.in-addr.arpa. (44)
15:19:50.469431 IP dns.google.domain > lenovo-001.52268: 39954 NXDomain 0/0/0 (44)
15:19:50.469881 IP lenovo-001.47412 > dns.google.domain: 30079+ [1au] PTR? 211.111.10.10.in-addr.arpa. (55)
15:19:50.487185 IP dns.google.domain > lenovo-001.47412: 30079 NXDomain 0/0/1 (55)
15:19:50.487329 IP lenovo-001.47412 > dns.google.domain: 30079+ PTR? 211.111.10.10.in-addr.arpa. (44)
15:19:50.504970 IP dns.google.domain > lenovo-001.47412: 30079 NXDomain 0/0/0 (44)
15:19:50.505478 IP lenovo-001.45917 > dns.google.domain: 54602+ [1au] PTR? 212.96.10.10.in-addr.arpa. (54)
15:19:50.521622 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:19:50.526866 IP dns.google.domain > lenovo-001.45917: 54602 NXDomain 0/0/1 (54)
15:19:50.527047 IP lenovo-001.45917 > dns.google.domain: 54602+ PTR? 212.96.10.10.in-addr.arpa. (43)
15:19:50.546211 IP dns.google.domain > lenovo-001.45917: 54602 NXDomain 0/0/0 (43)
15:19:50.546669 IP lenovo-001.60270 > dns.google.domain: 48881+ [1au] PTR? 212.97.10.10.in-addr.arpa. (54)
15:19:50.563104 IP 10.10.1.119.46226 > 255.255.255.255.29810: UDP, length 367
15:19:50.564727 IP dns.google.domain > lenovo-001.60270: 48881 NXDomain 0/0/1 (54)
15:19:50.564797 IP lenovo-001.60270 > dns.google.domain: 48881+ PTR? 212.97.10.10.in-addr.arpa. (43)
15:19:50.582010 IP dns.google.domain > lenovo-001.60270: 48881 NXDomain 0/0/0 (43)
15:19:50.582420 IP lenovo-001.56628 > dns.google.domain: 48335+ [1au] PTR? 212.98.10.10.in-addr.arpa. (54)
15:19:50.601728 IP dns.google.domain > lenovo-001.56628: 48335 NXDomain 0/0/1 (54)
15:19:50.601842 IP lenovo-001.56628 > dns.google.domain: 48335+ PTR? 212.98.10.10.in-addr.arpa. (43)
15:19:50.620378 IP dns.google.domain > lenovo-001.56628: 48335 NXDomain 0/0/0 (43)
15:19:50.620812 IP lenovo-001.55664 > dns.google.domain: 13649+ [1au] PTR? 212.99.10.10.in-addr.arpa. (54)
15:19:50.622733 ARP, Request who-has 10.10.107.212 tell 10.10.1.69, length 46
15:19:50.622745 ARP, Request who-has 10.10.108.212 tell 10.10.1.69, length 46
15:19:50.622746 ARP, Request who-has 10.10.109.212 tell 10.10.1.69, length 46
15:19:50.622748 ARP, Request who-has 10.10.110.212 tell 10.10.1.69, length 46
15:19:50.622750 ARP, Request who-has 10.10.111.212 tell 10.10.1.69, length 46
15:19:50.622752 ARP, Request who-has 10.10.96.213 tell 10.10.1.69, length 46
15:19:50.622753 ARP, Request who-has 10.10.97.213 tell 10.10.1.69, length 46
15:19:50.622755 ARP, Request who-has 10.10.98.213 tell 10.10.1.69, length 46
15:19:50.622773 ARP, Request who-has 10.10.99.213 tell 10.10.1.69, length 46
15:19:50.622775 ARP, Request who-has 10.10.100.213 tell 10.10.1.69, length 46
15:19:50.639472 IP dns.google.domain > lenovo-001.55664: 13649 NXDomain 0/0/1 (54)
15:19:50.639525 IP lenovo-001.55664 > dns.google.domain: 13649+ PTR? 212.99.10.10.in-addr.arpa. (43)
15:19:50.657450 IP dns.google.domain > lenovo-001.55664: 13649 NXDomain 0/0/0 (43)
15:19:50.657890 IP lenovo-001.46778 > dns.google.domain: 60455+ [1au] PTR? 212.100.10.10.in-addr.arpa. (55)
15:19:50.676752 IP dns.google.domain > lenovo-001.46778: 60455 NXDomain 0/0/1 (55)
15:19:50.676910 IP lenovo-001.46778 > dns.google.domain: 60455+ PTR? 212.100.10.10.in-addr.arpa. (44)
15:19:50.694641 IP dns.google.domain > lenovo-001.46778: 60455 NXDomain 0/0/0 (44)
15:19:50.695083 IP lenovo-001.56967 > dns.google.domain: 44807+ [1au] PTR? 212.101.10.10.in-addr.arpa. (55)
15:19:50.712666 IP dns.google.domain > lenovo-001.56967: 44807 NXDomain 0/0/1 (55)
15:19:50.712773 IP lenovo-001.56967 > dns.google.domain: 44807+ PTR? 212.101.10.10.in-addr.arpa. (44)
15:19:50.729904 IP dns.google.domain > lenovo-001.56967: 44807 NXDomain 0/0/0 (44)
15:19:50.730441 IP lenovo-001.40673 > dns.google.domain: 23163+ [1au] PTR? 212.102.10.10.in-addr.arpa. (55)
15:19:50.750011 IP dns.google.domain > lenovo-001.40673: 23163 NXDomain 0/0/1 (55)
15:19:50.750132 IP lenovo-001.40673 > dns.google.domain: 23163+ PTR? 212.102.10.10.in-addr.arpa. (44)
15:19:50.769036 IP dns.google.domain > lenovo-001.40673: 23163 NXDomain 0/0/0 (44)
15:19:50.769786 IP lenovo-001.48838 > dns.google.domain: 61671+ [1au] PTR? 212.107.10.10.in-addr.arpa. (55)
15:19:50.789716 IP dns.google.domain > lenovo-001.48838: 61671 NXDomain 0/0/1 (55)
15:19:50.789829 IP lenovo-001.48838 > dns.google.domain: 61671+ PTR? 212.107.10.10.in-addr.arpa. (44)
15:19:50.809046 IP dns.google.domain > lenovo-001.48838: 61671 NXDomain 0/0/0 (44)
15:19:50.809520 IP lenovo-001.41178 > dns.google.domain: 54323+ [1au] PTR? 212.108.10.10.in-addr.arpa. (55)
15:19:50.823472 ARP, Request who-has 10.10.105.213 tell 10.10.1.69, length 46
15:19:50.823483 ARP, Request who-has 10.10.106.213 tell 10.10.1.69, length 46
15:19:50.823485 ARP, Request who-has 10.10.107.213 tell 10.10.1.69, length 46
15:19:50.823487 ARP, Request who-has 10.10.108.213 tell 10.10.1.69, length 46
15:19:50.823489 ARP, Request who-has 10.10.109.213 tell 10.10.1.69, length 46
15:19:50.823491 ARP, Request who-has 10.10.110.213 tell 10.10.1.69, length 46
15:19:50.823492 ARP, Request who-has 10.10.111.213 tell 10.10.1.69, length 46
15:19:50.823494 ARP, Request who-has 10.10.96.214 tell 10.10.1.69, length 46
15:19:50.823508 ARP, Request who-has 10.10.97.214 tell 10.10.1.69, length 46
15:19:50.823510 ARP, Request who-has 10.10.98.214 tell 10.10.1.69, length 46
15:19:50.829647 IP dns.google.domain > lenovo-001.41178: 54323 NXDomain 0/0/1 (55)
15:19:50.829761 IP lenovo-001.41178 > dns.google.domain: 54323+ PTR? 212.108.10.10.in-addr.arpa. (44)
15:19:50.849123 IP dns.google.domain > lenovo-001.41178: 54323 NXDomain 0/0/0 (44)
15:19:50.849507 IP lenovo-001.40549 > dns.google.domain: 58914+ [1au] PTR? 212.109.10.10.in-addr.arpa. (55)
15:19:50.870000 IP dns.google.domain > lenovo-001.40549: 58914 NXDomain 0/0/1 (55)
15:19:50.870118 IP lenovo-001.40549 > dns.google.domain: 58914+ PTR? 212.109.10.10.in-addr.arpa. (44)
15:19:50.889682 IP dns.google.domain > lenovo-001.40549: 58914 NXDomain 0/0/0 (44)
15:19:50.890126 IP lenovo-001.51731 > dns.google.domain: 39571+ [1au] PTR? 212.110.10.10.in-addr.arpa. (55)
15:19:50.910107 IP dns.google.domain > lenovo-001.51731: 39571 NXDomain 0/0/1 (55)
15:19:50.910226 IP lenovo-001.51731 > dns.google.domain: 39571+ PTR? 212.110.10.10.in-addr.arpa. (44)
15:19:50.929508 IP dns.google.domain > lenovo-001.51731: 39571 NXDomain 0/0/0 (44)
15:19:50.929902 IP lenovo-001.37147 > dns.google.domain: 24841+ [1au] PTR? 212.111.10.10.in-addr.arpa. (55)
15:19:50.947376 IP dns.google.domain > lenovo-001.37147: 24841 NXDomain 0/0/1 (55)
15:19:50.947450 IP lenovo-001.37147 > dns.google.domain: 24841+ PTR? 212.111.10.10.in-addr.arpa. (44)
15:19:50.964403 IP dns.google.domain > lenovo-001.37147: 24841 NXDomain 0/0/0 (44)
15:19:50.964793 IP lenovo-001.40345 > dns.google.domain: 32745+ [1au] PTR? 213.96.10.10.in-addr.arpa. (54)
15:19:50.983390 IP dns.google.domain > lenovo-001.40345: 32745 NXDomain 0/0/1 (54)
15:19:50.983551 IP lenovo-001.40345 > dns.google.domain: 32745+ PTR? 213.96.10.10.in-addr.arpa. (43)
15:19:51.001763 IP dns.google.domain > lenovo-001.40345: 32745 NXDomain 0/0/0 (43)
15:19:51.002213 IP lenovo-001.51879 > dns.google.domain: 50277+ [1au] PTR? 213.97.10.10.in-addr.arpa. (54)
15:19:51.022845 IP dns.google.domain > lenovo-001.51879: 50277 NXDomain 0/0/1 (54)
15:19:51.023048 IP lenovo-001.51879 > dns.google.domain: 50277+ PTR? 213.97.10.10.in-addr.arpa. (43)
15:19:51.024162 ARP, Request who-has 10.10.105.213 tell 10.10.1.69, length 46
15:19:51.024178 ARP, Request who-has 10.10.106.213 tell 10.10.1.69, length 46
15:19:51.024180 ARP, Request who-has 10.10.107.213 tell 10.10.1.69, length 46
15:19:51.024182 ARP, Request who-has 10.10.108.213 tell 10.10.1.69, length 46
15:19:51.024184 ARP, Request who-has 10.10.109.213 tell 10.10.1.69, length 46
15:19:51.024185 ARP, Request who-has 10.10.110.213 tell 10.10.1.69, length 46
15:19:51.024187 ARP, Request who-has 10.10.111.213 tell 10.10.1.69, length 46
15:19:51.024189 ARP, Request who-has 10.10.96.214 tell 10.10.1.69, length 46
15:19:51.024207 ARP, Request who-has 10.10.97.214 tell 10.10.1.69, length 46
15:19:51.024209 ARP, Request who-has 10.10.98.214 tell 10.10.1.69, length 46
15:19:51.042518 IP dns.google.domain > lenovo-001.51879: 50277 NXDomain 0/0/0 (43)
15:19:51.042942 IP lenovo-001.44532 > dns.google.domain: 13562+ [1au] PTR? 213.98.10.10.in-addr.arpa. (54)
15:19:51.062936 IP dns.google.domain > lenovo-001.44532: 13562 NXDomain 0/0/1 (54)
15:19:51.063074 IP lenovo-001.44532 > dns.google.domain: 13562+ PTR? 213.98.10.10.in-addr.arpa. (43)
15:19:51.082176 IP dns.google.domain > lenovo-001.44532: 13562 NXDomain 0/0/0 (43)
15:19:51.082572 IP lenovo-001.39831 > dns.google.domain: 59946+ [1au] PTR? 213.99.10.10.in-addr.arpa. (54)
15:19:51.100236 IP dns.google.domain > lenovo-001.39831: 59946 NXDomain 0/0/1 (54)
15:19:51.100363 IP lenovo-001.39831 > dns.google.domain: 59946+ PTR? 213.99.10.10.in-addr.arpa. (43)
15:19:51.116970 IP dns.google.domain > lenovo-001.39831: 59946 NXDomain 0/0/0 (43)
15:19:51.117450 IP lenovo-001.54950 > dns.google.domain: 42566+ [1au] PTR? 213.100.10.10.in-addr.arpa. (55)
15:19:51.137767 IP dns.google.domain > lenovo-001.54950: 42566 NXDomain 0/0/1 (55)
15:19:51.137966 IP lenovo-001.54950 > dns.google.domain: 42566+ PTR? 213.100.10.10.in-addr.arpa. (44)
15:19:51.157423 IP dns.google.domain > lenovo-001.54950: 42566 NXDomain 0/0/0 (44)
15:19:51.158052 IP lenovo-001.55321 > dns.google.domain: 27425+ [1au] PTR? 213.105.10.10.in-addr.arpa. (55)
15:19:51.176843 IP dns.google.domain > lenovo-001.55321: 27425 NXDomain 0/0/1 (55)
15:19:51.177035 IP lenovo-001.55321 > dns.google.domain: 27425+ PTR? 213.105.10.10.in-addr.arpa. (44)
15:19:51.195245 IP dns.google.domain > lenovo-001.55321: 27425 NXDomain 0/0/0 (44)
15:19:51.195680 IP lenovo-001.52683 > dns.google.domain: 27453+ [1au] PTR? 213.106.10.10.in-addr.arpa. (55)
15:19:51.212924 IP dns.google.domain > lenovo-001.52683: 27453 NXDomain 0/0/1 (55)
15:19:51.213114 IP lenovo-001.52683 > dns.google.domain: 27453+ PTR? 213.106.10.10.in-addr.arpa. (44)
15:19:51.224932 ARP, Request who-has 10.10.103.214 tell 10.10.1.69, length 46
15:19:51.224948 ARP, Request who-has 10.10.104.214 tell 10.10.1.69, length 46
15:19:51.224950 ARP, Request who-has 10.10.105.214 tell 10.10.1.69, length 46
15:19:51.224951 ARP, Request who-has 10.10.106.214 tell 10.10.1.69, length 46
15:19:51.224953 ARP, Request who-has 10.10.107.214 tell 10.10.1.69, length 46
15:19:51.224955 ARP, Request who-has 10.10.108.214 tell 10.10.1.69, length 46
15:19:51.224957 ARP, Request who-has 10.10.109.214 tell 10.10.1.69, length 46
15:19:51.224958 ARP, Request who-has 10.10.110.214 tell 10.10.1.69, length 46
15:19:51.224976 ARP, Request who-has 10.10.111.214 tell 10.10.1.69, length 46
15:19:51.224978 ARP, Request who-has 10.10.96.215 tell 10.10.1.69, length 46
15:19:51.230308 IP dns.google.domain > lenovo-001.52683: 27453 NXDomain 0/0/0 (44)
15:19:51.230605 IP lenovo-001.39152 > dns.google.domain: 65313+ [1au] PTR? 213.107.10.10.in-addr.arpa. (55)
15:19:51.250533 IP dns.google.domain > lenovo-001.39152: 65313 NXDomain 0/0/1 (55)
15:19:51.250734 IP lenovo-001.39152 > dns.google.domain: 65313+ PTR? 213.107.10.10.in-addr.arpa. (44)
15:19:51.258554 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:51.269726 IP dns.google.domain > lenovo-001.39152: 65313 NXDomain 0/0/0 (44)
15:19:51.270153 IP lenovo-001.56485 > dns.google.domain: 35513+ [1au] PTR? 213.108.10.10.in-addr.arpa. (55)
15:19:51.290872 IP dns.google.domain > lenovo-001.56485: 35513 NXDomain 0/0/1 (55)
15:19:51.291077 IP lenovo-001.56485 > dns.google.domain: 35513+ PTR? 213.108.10.10.in-addr.arpa. (44)
15:19:51.309103 IP dns.google.domain > lenovo-001.56485: 35513 NXDomain 0/0/0 (44)
15:19:51.309469 IP lenovo-001.56392 > dns.google.domain: 21721+ [1au] PTR? 213.109.10.10.in-addr.arpa. (55)
15:19:51.329283 IP dns.google.domain > lenovo-001.56392: 21721 NXDomain 0/0/1 (55)
15:19:51.329408 IP lenovo-001.56392 > dns.google.domain: 21721+ PTR? 213.109.10.10.in-addr.arpa. (44)
15:19:51.348779 IP dns.google.domain > lenovo-001.56392: 21721 NXDomain 0/0/0 (44)
15:19:51.349126 IP lenovo-001.48774 > dns.google.domain: 57053+ [1au] PTR? 213.110.10.10.in-addr.arpa. (55)
15:19:51.367030 IP dns.google.domain > lenovo-001.48774: 57053 NXDomain 0/0/1 (55)
15:19:51.367113 IP lenovo-001.48774 > dns.google.domain: 57053+ PTR? 213.110.10.10.in-addr.arpa. (44)
15:19:51.384188 IP dns.google.domain > lenovo-001.48774: 57053 NXDomain 0/0/0 (44)
15:19:51.384528 IP lenovo-001.52783 > dns.google.domain: 2213+ [1au] PTR? 213.111.10.10.in-addr.arpa. (55)
15:19:51.412931 IP dns.google.domain > lenovo-001.52783: 2213 NXDomain 0/0/1 (55)
15:19:51.413042 IP lenovo-001.52783 > dns.google.domain: 2213+ PTR? 213.111.10.10.in-addr.arpa. (44)
15:19:51.425380 ARP, Request who-has 10.10.103.214 tell 10.10.1.69, length 46
15:19:51.425390 ARP, Request who-has 10.10.104.214 tell 10.10.1.69, length 46
15:19:51.425392 ARP, Request who-has 10.10.105.214 tell 10.10.1.69, length 46
15:19:51.425394 ARP, Request who-has 10.10.106.214 tell 10.10.1.69, length 46
15:19:51.425396 ARP, Request who-has 10.10.107.214 tell 10.10.1.69, length 46
15:19:51.425397 ARP, Request who-has 10.10.108.214 tell 10.10.1.69, length 46
15:19:51.425399 ARP, Request who-has 10.10.109.214 tell 10.10.1.69, length 46
15:19:51.425401 ARP, Request who-has 10.10.110.214 tell 10.10.1.69, length 46
15:19:51.425414 ARP, Request who-has 10.10.111.214 tell 10.10.1.69, length 46
15:19:51.425416 ARP, Request who-has 10.10.96.215 tell 10.10.1.69, length 46
15:19:51.433391 IP dns.google.domain > lenovo-001.52783: 2213 NXDomain 0/0/0 (44)
15:19:51.433738 IP lenovo-001.58623 > dns.google.domain: 3458+ [1au] PTR? 214.96.10.10.in-addr.arpa. (54)
15:19:51.453460 IP dns.google.domain > lenovo-001.58623: 3458 NXDomain 0/0/1 (54)
15:19:51.453634 IP lenovo-001.58623 > dns.google.domain: 3458+ PTR? 214.96.10.10.in-addr.arpa. (43)
15:19:51.471899 IP dns.google.domain > lenovo-001.58623: 3458 NXDomain 0/0/0 (43)
15:19:51.472433 IP lenovo-001.44125 > dns.google.domain: 45473+ [1au] PTR? 214.97.10.10.in-addr.arpa. (54)
15:19:51.493093 IP dns.google.domain > lenovo-001.44125: 45473 NXDomain 0/0/1 (54)
15:19:51.493303 IP lenovo-001.44125 > dns.google.domain: 45473+ PTR? 214.97.10.10.in-addr.arpa. (43)
15:19:51.512891 IP dns.google.domain > lenovo-001.44125: 45473 NXDomain 0/0/0 (43)
15:19:51.513444 IP lenovo-001.34819 > dns.google.domain: 37684+ [1au] PTR? 214.98.10.10.in-addr.arpa. (54)
15:19:51.533896 IP dns.google.domain > lenovo-001.34819: 37684 NXDomain 0/0/1 (54)
15:19:51.534070 IP lenovo-001.34819 > dns.google.domain: 37684+ PTR? 214.98.10.10.in-addr.arpa. (43)
15:19:51.553300 IP dns.google.domain > lenovo-001.34819: 37684 NXDomain 0/0/0 (43)
15:19:51.553982 IP lenovo-001.49086 > dns.google.domain: 49905+ [1au] PTR? 214.103.10.10.in-addr.arpa. (55)
15:19:51.574267 IP dns.google.domain > lenovo-001.49086: 49905 NXDomain 0/0/1 (55)
15:19:51.574387 IP lenovo-001.49086 > dns.google.domain: 49905+ PTR? 214.103.10.10.in-addr.arpa. (44)
15:19:51.592466 IP dns.google.domain > lenovo-001.49086: 49905 NXDomain 0/0/0 (44)
15:19:51.592889 IP lenovo-001.38770 > dns.google.domain: 12019+ [1au] PTR? 214.104.10.10.in-addr.arpa. (55)
15:19:51.611886 IP dns.google.domain > lenovo-001.38770: 12019 NXDomain 0/0/1 (55)
15:19:51.611981 IP lenovo-001.38770 > dns.google.domain: 12019+ PTR? 214.104.10.10.in-addr.arpa. (44)
15:19:51.626256 ARP, Request who-has 10.10.101.215 tell 10.10.1.69, length 46
15:19:51.626272 ARP, Request who-has 10.10.102.215 tell 10.10.1.69, length 46
15:19:51.626274 ARP, Request who-has 10.10.103.215 tell 10.10.1.69, length 46
15:19:51.626276 ARP, Request who-has 10.10.104.215 tell 10.10.1.69, length 46
15:19:51.626278 ARP, Request who-has 10.10.105.215 tell 10.10.1.69, length 46
15:19:51.626279 ARP, Request who-has 10.10.106.215 tell 10.10.1.69, length 46
15:19:51.626281 ARP, Request who-has 10.10.107.215 tell 10.10.1.69, length 46
15:19:51.626283 ARP, Request who-has 10.10.108.215 tell 10.10.1.69, length 46
15:19:51.626301 ARP, Request who-has 10.10.109.215 tell 10.10.1.69, length 46
15:19:51.626307 ARP, Request who-has 10.10.110.215 tell 10.10.1.69, length 46
15:19:51.632342 IP dns.google.domain > lenovo-001.38770: 12019 NXDomain 0/0/0 (44)
15:19:51.632788 IP lenovo-001.57524 > dns.google.domain: 21755+ [1au] PTR? 214.105.10.10.in-addr.arpa. (55)
15:19:51.651370 IP dns.google.domain > lenovo-001.57524: 21755 NXDomain 0/0/1 (55)
15:19:51.651426 IP lenovo-001.57524 > dns.google.domain: 21755+ PTR? 214.105.10.10.in-addr.arpa. (44)
15:19:51.667403 IP dns.google.domain > lenovo-001.57524: 21755 NXDomain 0/0/0 (44)
15:19:51.667854 IP lenovo-001.53748 > dns.google.domain: 38125+ [1au] PTR? 214.106.10.10.in-addr.arpa. (55)
15:19:51.686177 IP dns.google.domain > lenovo-001.53748: 38125 NXDomain 0/0/1 (55)
15:19:51.686352 IP lenovo-001.53748 > dns.google.domain: 38125+ PTR? 214.106.10.10.in-addr.arpa. (44)
15:19:51.704593 IP dns.google.domain > lenovo-001.53748: 38125 NXDomain 0/0/0 (44)
15:19:51.705018 IP lenovo-001.59015 > dns.google.domain: 57899+ [1au] PTR? 214.107.10.10.in-addr.arpa. (55)
15:19:51.724094 IP dns.google.domain > lenovo-001.59015: 57899 NXDomain 0/0/1 (55)
15:19:51.724305 IP lenovo-001.59015 > dns.google.domain: 57899+ PTR? 214.107.10.10.in-addr.arpa. (44)
15:19:51.741689 IP dns.google.domain > lenovo-001.59015: 57899 NXDomain 0/0/0 (44)
15:19:51.742057 IP lenovo-001.47422 > dns.google.domain: 20826+ [1au] PTR? 214.108.10.10.in-addr.arpa. (55)
15:19:51.755115 ARP, Request who-has lenovo-001 tell _gateway, length 46
15:19:51.755133 ARP, Reply lenovo-001 is-at f4:6b:8c:8c:ee:1f (oui Unknown), length 28
15:19:51.761277 IP dns.google.domain > lenovo-001.47422: 20826 NXDomain 0/0/1 (55)
15:19:51.761384 IP lenovo-001.47422 > dns.google.domain: 20826+ PTR? 214.108.10.10.in-addr.arpa. (44)
15:19:51.779574 IP dns.google.domain > lenovo-001.47422: 20826 NXDomain 0/0/0 (44)
15:19:51.780110 IP lenovo-001.35239 > dns.google.domain: 1660+ [1au] PTR? 214.109.10.10.in-addr.arpa. (55)
15:19:51.799403 IP dns.google.domain > lenovo-001.35239: 1660 NXDomain 0/0/1 (55)
15:19:51.799541 IP lenovo-001.35239 > dns.google.domain: 1660+ PTR? 214.109.10.10.in-addr.arpa. (44)
15:19:51.817757 IP dns.google.domain > lenovo-001.35239: 1660 NXDomain 0/0/0 (44)
15:19:51.818211 IP lenovo-001.45927 > dns.google.domain: 7592+ [1au] PTR? 214.110.10.10.in-addr.arpa. (55)
15:19:51.826730 ARP, Request who-has 10.10.101.215 tell 10.10.1.69, length 46
15:19:51.826741 ARP, Request who-has 10.10.102.215 tell 10.10.1.69, length 46
15:19:51.826743 ARP, Request who-has 10.10.103.215 tell 10.10.1.69, length 46
15:19:51.826745 ARP, Request who-has 10.10.104.215 tell 10.10.1.69, length 46
15:19:51.826746 ARP, Request who-has 10.10.105.215 tell 10.10.1.69, length 46
15:19:51.826748 ARP, Request who-has 10.10.106.215 tell 10.10.1.69, length 46
15:19:51.826750 ARP, Request who-has 10.10.107.215 tell 10.10.1.69, length 46
15:19:51.826784 ARP, Request who-has 10.10.108.215 tell 10.10.1.69, length 46
15:19:51.826786 ARP, Request who-has 10.10.109.215 tell 10.10.1.69, length 46
15:19:51.826788 ARP, Request who-has 10.10.110.215 tell 10.10.1.69, length 46
15:19:51.835384 IP dns.google.domain > lenovo-001.45927: 7592 NXDomain 0/0/1 (55)
15:19:51.835483 IP lenovo-001.45927 > dns.google.domain: 7592+ PTR? 214.110.10.10.in-addr.arpa. (44)
15:19:51.851947 IP dns.google.domain > lenovo-001.45927: 7592 NXDomain 0/0/0 (44)
15:19:51.852457 IP lenovo-001.47973 > dns.google.domain: 58264+ [1au] PTR? 214.111.10.10.in-addr.arpa. (55)
15:19:51.864225 ARP, Request who-has _gateway tell lenovo-001, length 28
15:19:51.864333 ARP, Reply _gateway is-at 00:90:7f:a0:ba:47 (oui Unknown), length 46
15:19:51.869099 IP dns.google.domain > lenovo-001.47973: 58264 NXDomain 0/0/1 (55)
15:19:51.869157 IP lenovo-001.47973 > dns.google.domain: 58264+ PTR? 214.111.10.10.in-addr.arpa. (44)
15:19:51.885171 IP dns.google.domain > lenovo-001.47973: 58264 NXDomain 0/0/0 (44)
15:19:51.885694 IP lenovo-001.59331 > dns.google.domain: 20968+ [1au] PTR? 215.96.10.10.in-addr.arpa. (54)
15:19:51.902123 IP dns.google.domain > lenovo-001.59331: 20968 NXDomain 0/0/1 (54)
15:19:51.902311 IP lenovo-001.59331 > dns.google.domain: 20968+ PTR? 215.96.10.10.in-addr.arpa. (43)
15:19:51.918110 IP dns.google.domain > lenovo-001.59331: 20968 NXDomain 0/0/0 (43)
15:19:51.918750 IP lenovo-001.55597 > dns.google.domain: 57148+ [1au] PTR? 215.101.10.10.in-addr.arpa. (55)
15:19:51.937676 IP dns.google.domain > lenovo-001.55597: 57148 NXDomain 0/0/1 (55)
15:19:51.937889 IP lenovo-001.55597 > dns.google.domain: 57148+ PTR? 215.101.10.10.in-addr.arpa. (44)
15:19:51.956415 IP dns.google.domain > lenovo-001.55597: 57148 NXDomain 0/0/0 (44)
15:19:51.956942 IP lenovo-001.50507 > dns.google.domain: 3255+ [1au] PTR? 215.102.10.10.in-addr.arpa. (55)
15:19:51.976286 IP dns.google.domain > lenovo-001.50507: 3255 NXDomain 0/0/1 (55)
15:19:51.976484 IP lenovo-001.50507 > dns.google.domain: 3255+ PTR? 215.102.10.10.in-addr.arpa. (44)
15:19:51.996422 IP dns.google.domain > lenovo-001.50507: 3255 NXDomain 0/0/0 (44)
15:19:51.996959 IP lenovo-001.54052 > dns.google.domain: 52672+ [1au] PTR? 215.103.10.10.in-addr.arpa. (55)
15:19:52.014280 IP dns.google.domain > lenovo-001.54052: 52672 NXDomain 0/0/1 (55)
15:19:52.014445 IP lenovo-001.54052 > dns.google.domain: 52672+ PTR? 215.103.10.10.in-addr.arpa. (44)
15:19:52.027668 ARP, Request who-has 10.10.99.216 tell 10.10.1.69, length 46
15:19:52.027684 ARP, Request who-has 10.10.100.216 tell 10.10.1.69, length 46
15:19:52.027686 ARP, Request who-has 10.10.101.216 tell 10.10.1.69, length 46
15:19:52.027687 ARP, Request who-has 10.10.102.216 tell 10.10.1.69, length 46
15:19:52.027689 ARP, Request who-has 10.10.103.216 tell 10.10.1.69, length 46
15:19:52.027691 ARP, Request who-has 10.10.104.216 tell 10.10.1.69, length 46
15:19:52.027692 ARP, Request who-has 10.10.105.216 tell 10.10.1.69, length 46
15:19:52.027694 ARP, Request who-has 10.10.106.216 tell 10.10.1.69, length 46
15:19:52.027712 ARP, Request who-has 10.10.107.216 tell 10.10.1.69, length 46
15:19:52.027714 ARP, Request who-has 10.10.108.216 tell 10.10.1.69, length 46
15:19:52.031256 IP dns.google.domain > lenovo-001.54052: 52672 NXDomain 0/0/0 (44)
15:19:52.031723 IP lenovo-001.43602 > dns.google.domain: 2151+ [1au] PTR? 215.104.10.10.in-addr.arpa. (55)
15:19:52.050519 IP dns.google.domain > lenovo-001.43602: 2151 NXDomain 0/0/1 (55)
15:19:52.050722 IP lenovo-001.43602 > dns.google.domain: 2151+ PTR? 215.104.10.10.in-addr.arpa. (44)
15:19:52.068376 IP dns.google.domain > lenovo-001.43602: 2151 NXDomain 0/0/0 (44)
15:19:52.068791 IP lenovo-001.60165 > dns.google.domain: 44661+ [1au] PTR? 215.105.10.10.in-addr.arpa. (55)
15:19:52.088766 IP dns.google.domain > lenovo-001.60165: 44661 NXDomain 0/0/1 (55)
15:19:52.088965 IP lenovo-001.60165 > dns.google.domain: 44661+ PTR? 215.105.10.10.in-addr.arpa. (44)
15:19:52.108028 IP dns.google.domain > lenovo-001.60165: 44661 NXDomain 0/0/0 (44)
15:19:52.108511 IP lenovo-001.45235 > dns.google.domain: 59149+ [1au] PTR? 215.106.10.10.in-addr.arpa. (55)
15:19:52.128682 IP dns.google.domain > lenovo-001.45235: 59149 NXDomain 0/0/1 (55)
15:19:52.128876 IP lenovo-001.45235 > dns.google.domain: 59149+ PTR? 215.106.10.10.in-addr.arpa. (44)
15:19:52.148446 IP dns.google.domain > lenovo-001.45235: 59149 NXDomain 0/0/0 (44)
15:19:52.148964 IP lenovo-001.59541 > dns.google.domain: 59428+ [1au] PTR? 215.107.10.10.in-addr.arpa. (55)
15:19:52.166545 IP dns.google.domain > lenovo-001.59541: 59428 NXDomain 0/0/1 (55)
15:19:52.166739 IP lenovo-001.59541 > dns.google.domain: 59428+ PTR? 215.107.10.10.in-addr.arpa. (44)
15:19:52.183601 IP dns.google.domain > lenovo-001.59541: 59428 NXDomain 0/0/0 (44)
15:19:52.184147 IP lenovo-001.33842 > dns.google.domain: 34054+ [1au] PTR? 215.108.10.10.in-addr.arpa. (55)
15:19:52.205221 IP dns.google.domain > lenovo-001.33842: 34054 NXDomain 0/0/1 (55)
15:19:52.205349 IP lenovo-001.33842 > dns.google.domain: 34054+ PTR? 215.108.10.10.in-addr.arpa. (44)
15:19:52.224823 IP dns.google.domain > lenovo-001.33842: 34054 NXDomain 0/0/0 (44)
15:19:52.225425 IP lenovo-001.52769 > dns.google.domain: 63592+ [1au] PTR? 215.109.10.10.in-addr.arpa. (55)
15:19:52.228227 ARP, Request who-has 10.10.99.216 tell 10.10.1.69, length 46
15:19:52.228239 ARP, Request who-has 10.10.100.216 tell 10.10.1.69, length 46
15:19:52.228241 ARP, Request who-has 10.10.101.216 tell 10.10.1.69, length 46
15:19:52.228243 ARP, Request who-has 10.10.102.216 tell 10.10.1.69, length 46
15:19:52.228244 ARP, Request who-has 10.10.103.216 tell 10.10.1.69, length 46
15:19:52.228246 ARP, Request who-has 10.10.104.216 tell 10.10.1.69, length 46
15:19:52.228248 ARP, Request who-has 10.10.105.216 tell 10.10.1.69, length 46
15:19:52.228250 ARP, Request who-has 10.10.106.216 tell 10.10.1.69, length 46
15:19:52.228267 ARP, Request who-has 10.10.107.216 tell 10.10.1.69, length 46
15:19:52.228269 ARP, Request who-has 10.10.108.216 tell 10.10.1.69, length 46
15:19:52.244572 IP dns.google.domain > lenovo-001.52769: 63592 NXDomain 0/0/1 (55)
15:19:52.244757 IP lenovo-001.52769 > dns.google.domain: 63592+ PTR? 215.109.10.10.in-addr.arpa. (44)
15:19:52.262045 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:52.262061 IP dns.google.domain > lenovo-001.52769: 63592 NXDomain 0/0/0 (44)
15:19:52.262561 IP lenovo-001.46677 > dns.google.domain: 9506+ [1au] PTR? 215.110.10.10.in-addr.arpa. (55)
15:19:52.283700 IP dns.google.domain > lenovo-001.46677: 9506 NXDomain 0/0/1 (55)
15:19:52.283851 IP lenovo-001.46677 > dns.google.domain: 9506+ PTR? 215.110.10.10.in-addr.arpa. (44)
15:19:52.301213 IP dns.google.domain > lenovo-001.46677: 9506 NXDomain 0/0/0 (44)
15:19:52.301979 IP lenovo-001.59526 > dns.google.domain: 34226+ [1au] PTR? 216.99.10.10.in-addr.arpa. (54)
15:19:52.319468 IP dns.google.domain > lenovo-001.59526: 34226 NXDomain 0/0/1 (54)
15:19:52.319571 IP lenovo-001.59526 > dns.google.domain: 34226+ PTR? 216.99.10.10.in-addr.arpa. (43)
15:19:52.336742 IP dns.google.domain > lenovo-001.59526: 34226 NXDomain 0/0/0 (43)
15:19:52.337215 IP lenovo-001.38105 > dns.google.domain: 22099+ [1au] PTR? 216.100.10.10.in-addr.arpa. (55)
15:19:52.359642 IP dns.google.domain > lenovo-001.38105: 22099 NXDomain 0/0/1 (55)
15:19:52.359719 IP lenovo-001.38105 > dns.google.domain: 22099+ PTR? 216.100.10.10.in-addr.arpa. (44)
15:19:52.378710 IP dns.google.domain > lenovo-001.38105: 22099 NXDomain 0/0/0 (44)
15:19:52.379232 IP lenovo-001.44827 > dns.google.domain: 49204+ [1au] PTR? 216.101.10.10.in-addr.arpa. (55)
15:19:52.404345 IP dns.google.domain > lenovo-001.44827: 49204 NXDomain 0/0/1 (55)
15:19:52.404509 IP lenovo-001.44827 > dns.google.domain: 49204+ PTR? 216.101.10.10.in-addr.arpa. (44)
15:19:52.428656 IP dns.google.domain > lenovo-001.44827: 49204 NXDomain 0/0/0 (44)
15:19:52.428854 ARP, Request who-has 10.10.97.217 tell 10.10.1.69, length 46
15:19:52.428860 ARP, Request who-has 10.10.98.217 tell 10.10.1.69, length 46
15:19:52.428860 ARP, Request who-has 10.10.99.217 tell 10.10.1.69, length 46
15:19:52.428861 ARP, Request who-has 10.10.100.217 tell 10.10.1.69, length 46
15:19:52.428861 ARP, Request who-has 10.10.101.217 tell 10.10.1.69, length 46
15:19:52.428861 ARP, Request who-has 10.10.102.217 tell 10.10.1.69, length 46
15:19:52.428862 ARP, Request who-has 10.10.103.217 tell 10.10.1.69, length 46
15:19:52.428862 ARP, Request who-has 10.10.104.217 tell 10.10.1.69, length 46
15:19:52.428867 ARP, Request who-has 10.10.105.217 tell 10.10.1.69, length 46
15:19:52.428867 ARP, Request who-has 10.10.106.217 tell 10.10.1.69, length 46
15:19:52.429126 IP lenovo-001.54640 > dns.google.domain: 25106+ [1au] PTR? 216.102.10.10.in-addr.arpa. (55)
15:19:52.446595 IP dns.google.domain > lenovo-001.54640: 25106 NXDomain 0/0/1 (55)
15:19:52.446786 IP lenovo-001.54640 > dns.google.domain: 25106+ PTR? 216.102.10.10.in-addr.arpa. (44)
15:19:52.463253 IP dns.google.domain > lenovo-001.54640: 25106 NXDomain 0/0/0 (44)
15:19:52.463737 IP lenovo-001.48782 > dns.google.domain: 3318+ [1au] PTR? 216.103.10.10.in-addr.arpa. (55)
15:19:52.483755 IP dns.google.domain > lenovo-001.48782: 3318 NXDomain 0/0/1 (55)
15:19:52.483940 IP lenovo-001.48782 > dns.google.domain: 3318+ PTR? 216.103.10.10.in-addr.arpa. (44)
15:19:52.502848 IP dns.google.domain > lenovo-001.48782: 3318 NXDomain 0/0/0 (44)
15:19:52.503410 IP lenovo-001.38387 > dns.google.domain: 43009+ [1au] PTR? 216.104.10.10.in-addr.arpa. (55)
15:19:52.521489 IP dns.google.domain > lenovo-001.38387: 43009 NXDomain 0/0/1 (55)
15:19:52.521661 STP 802.1w, Rapid STP, Flags [Learn, Forward, Agreement], bridge-id 8000.20:cf:ae:12:6f:31.800c, length 36
15:19:52.521692 IP lenovo-001.38387 > dns.google.domain: 43009+ PTR? 216.104.10.10.in-addr.arpa. (44)
15:19:52.538971 IP dns.google.domain > lenovo-001.38387: 43009 NXDomain 0/0/0 (44)
15:19:52.539553 IP lenovo-001.45792 > dns.google.domain: 15334+ [1au] PTR? 216.105.10.10.in-addr.arpa. (55)
15:19:52.558308 IP dns.google.domain > lenovo-001.45792: 15334 NXDomain 0/0/1 (55)
15:19:52.558512 IP lenovo-001.45792 > dns.google.domain: 15334+ PTR? 216.105.10.10.in-addr.arpa. (44)
15:19:52.576650 IP dns.google.domain > lenovo-001.45792: 15334 NXDomain 0/0/0 (44)
15:19:52.577175 IP lenovo-001.41345 > dns.google.domain: 25002+ [1au] PTR? 216.106.10.10.in-addr.arpa. (55)
15:19:52.597046 IP dns.google.domain > lenovo-001.41345: 25002 NXDomain 0/0/1 (55)
15:19:52.597254 IP lenovo-001.41345 > dns.google.domain: 25002+ PTR? 216.106.10.10.in-addr.arpa. (44)
15:19:52.616230 IP dns.google.domain > lenovo-001.41345: 25002 NXDomain 0/0/0 (44)
15:19:52.616766 IP lenovo-001.35528 > dns.google.domain: 14264+ [1au] PTR? 216.107.10.10.in-addr.arpa. (55)
15:19:52.629546 ARP, Request who-has 10.10.97.217 tell 10.10.1.69, length 46
15:19:52.629557 ARP, Request who-has 10.10.98.217 tell 10.10.1.69, length 46
15:19:52.629559 ARP, Request who-has 10.10.99.217 tell 10.10.1.69, length 46
15:19:52.629561 ARP, Request who-has 10.10.100.217 tell 10.10.1.69, length 46
15:19:52.629562 ARP, Request who-has 10.10.101.217 tell 10.10.1.69, length 46
15:19:52.629564 ARP, Request who-has 10.10.102.217 tell 10.10.1.69, length 46
15:19:52.629566 ARP, Request who-has 10.10.103.217 tell 10.10.1.69, length 46
15:19:52.629567 ARP, Request who-has 10.10.104.217 tell 10.10.1.69, length 46
15:19:52.629583 ARP, Request who-has 10.10.105.217 tell 10.10.1.69, length 46
15:19:52.629585 ARP, Request who-has 10.10.106.217 tell 10.10.1.69, length 46
15:19:52.636343 IP dns.google.domain > lenovo-001.35528: 14264 NXDomain 0/0/1 (55)
15:19:52.636490 IP lenovo-001.35528 > dns.google.domain: 14264+ PTR? 216.107.10.10.in-addr.arpa. (44)
15:19:52.655113 IP dns.google.domain > lenovo-001.35528: 14264 NXDomain 0/0/0 (44)
15:19:52.655628 IP lenovo-001.49558 > dns.google.domain: 24995+ [1au] PTR? 216.108.10.10.in-addr.arpa. (55)
15:19:52.675420 IP dns.google.domain > lenovo-001.49558: 24995 NXDomain 0/0/1 (55)
15:19:52.675588 IP lenovo-001.49558 > dns.google.domain: 24995+ PTR? 216.108.10.10.in-addr.arpa. (44)
15:19:52.694661 IP dns.google.domain > lenovo-001.49558: 24995 NXDomain 0/0/0 (44)
15:19:52.695415 IP lenovo-001.42959 > dns.google.domain: 45548+ [1au] PTR? 217.97.10.10.in-addr.arpa. (54)
15:19:52.713068 IP dns.google.domain > lenovo-001.42959: 45548 NXDomain 0/0/1 (54)
15:19:52.713265 IP lenovo-001.42959 > dns.google.domain: 45548+ PTR? 217.97.10.10.in-addr.arpa. (43)
15:19:52.730030 IP dns.google.domain > lenovo-001.42959: 45548 NXDomain 0/0/0 (43)
15:19:52.730555 IP lenovo-001.33536 > dns.google.domain: 19234+ [1au] PTR? 217.98.10.10.in-addr.arpa. (54)
15:19:52.750581 IP dns.google.domain > lenovo-001.33536: 19234 NXDomain 0/0/1 (54)
15:19:52.750772 IP lenovo-001.33536 > dns.google.domain: 19234+ PTR? 217.98.10.10.in-addr.arpa. (43)
15:19:52.769942 IP dns.google.domain > lenovo-001.33536: 19234 NXDomain 0/0/0 (43)
15:19:52.770506 IP lenovo-001.42395 > dns.google.domain: 50504+ [1au] PTR? 217.99.10.10.in-addr.arpa. (54)
15:19:52.787646 IP dns.google.domain > lenovo-001.42395: 50504 NXDomain 0/0/1 (54)
15:19:52.787751 IP lenovo-001.42395 > dns.google.domain: 50504+ PTR? 217.99.10.10.in-addr.arpa. (43)
15:19:52.804548 IP dns.google.domain > lenovo-001.42395: 50504 NXDomain 0/0/0 (43)
15:19:52.804995 IP lenovo-001.57694 > dns.google.domain: 10679+ [1au] PTR? 217.100.10.10.in-addr.arpa. (55)
15:19:52.822942 IP dns.google.domain > lenovo-001.57694: 10679 NXDomain 0/0/1 (55)
15:19:52.823146 IP lenovo-001.57694 > dns.google.domain: 10679+ PTR? 217.100.10.10.in-addr.arpa. (44)
15:19:52.830370 ARP, Request who-has 10.10.111.217 tell 10.10.1.69, length 46
15:19:52.830386 ARP, Request who-has 10.10.96.218 tell 10.10.1.69, length 46
15:19:52.830388 ARP, Request who-has 10.10.97.218 tell 10.10.1.69, length 46
15:19:52.830390 ARP, Request who-has 10.10.98.218 tell 10.10.1.69, length 46
15:19:52.830392 ARP, Request who-has 10.10.99.218 tell 10.10.1.69, length 46
15:19:52.830393 ARP, Request who-has 10.10.100.218 tell 10.10.1.69, length 46
15:19:52.830395 ARP, Request who-has 10.10.101.218 tell 10.10.1.69, length 46
15:19:52.830397 ARP, Request who-has 10.10.102.218 tell 10.10.1.69, length 46
15:19:52.830418 ARP, Request who-has 10.10.103.218 tell 10.10.1.69, length 46
15:19:52.830420 ARP, Request who-has 10.10.104.218 tell 10.10.1.69, length 46
15:19:52.840085 IP dns.google.domain > lenovo-001.57694: 10679 NXDomain 0/0/0 (44)
15:19:52.840552 IP lenovo-001.41107 > dns.google.domain: 1526+ [1au] PTR? 217.101.10.10.in-addr.arpa. (55)
15:19:52.858326 IP dns.google.domain > lenovo-001.41107: 1526 NXDomain 0/0/1 (55)
15:19:52.858480 IP lenovo-001.41107 > dns.google.domain: 1526+ PTR? 217.101.10.10.in-addr.arpa. (44)
15:19:52.875468 IP dns.google.domain > lenovo-001.41107: 1526 NXDomain 0/0/0 (44)
15:19:52.875901 IP lenovo-001.39295 > dns.google.domain: 22901+ [1au] PTR? 217.102.10.10.in-addr.arpa. (55)
15:19:52.895665 IP dns.google.domain > lenovo-001.39295: 22901 NXDomain 0/0/1 (55)
15:19:52.895767 IP lenovo-001.39295 > dns.google.domain: 22901+ PTR? 217.102.10.10.in-addr.arpa. (44)
15:19:52.914521 IP dns.google.domain > lenovo-001.39295: 22901 NXDomain 0/0/0 (44)
15:19:52.914863 IP lenovo-001.39679 > dns.google.domain: 36178+ [1au] PTR? 217.103.10.10.in-addr.arpa. (55)
15:19:52.934894 IP dns.google.domain > lenovo-001.39679: 36178 NXDomain 0/0/1 (55)
15:19:52.934969 IP lenovo-001.39679 > dns.google.domain: 36178+ PTR? 217.103.10.10.in-addr.arpa. (44)
15:19:52.954331 IP dns.google.domain > lenovo-001.39679: 36178 NXDomain 0/0/0 (44)
15:19:52.954886 IP lenovo-001.52506 > dns.google.domain: 9883+ [1au] PTR? 217.104.10.10.in-addr.arpa. (55)
15:19:52.975245 IP dns.google.domain > lenovo-001.52506: 9883 NXDomain 0/0/1 (55)
15:19:52.975456 IP lenovo-001.52506 > dns.google.domain: 9883+ PTR? 217.104.10.10.in-addr.arpa. (44)
15:19:52.995013 IP dns.google.domain > lenovo-001.52506: 9883 NXDomain 0/0/0 (44)
15:19:52.995548 IP lenovo-001.49948 > dns.google.domain: 60125+ [1au] PTR? 217.105.10.10.in-addr.arpa. (55)
15:19:53.014466 IP dns.google.domain > lenovo-001.49948: 60125 NXDomain 0/0/1 (55)
15:19:53.014672 IP lenovo-001.49948 > dns.google.domain: 60125+ PTR? 217.105.10.10.in-addr.arpa. (44)
15:19:53.031120 ARP, Request who-has 10.10.111.217 tell 10.10.1.69, length 46
15:19:53.031136 ARP, Request who-has 10.10.96.218 tell 10.10.1.69, length 46
15:19:53.031138 ARP, Request who-has 10.10.97.218 tell 10.10.1.69, length 46
15:19:53.031140 ARP, Request who-has 10.10.98.218 tell 10.10.1.69, length 46
15:19:53.031142 ARP, Request who-has 10.10.99.218 tell 10.10.1.69, length 46
15:19:53.031143 ARP, Request who-has 10.10.100.218 tell 10.10.1.69, length 46
15:19:53.031145 ARP, Request who-has 10.10.101.218 tell 10.10.1.69, length 46
15:19:53.031147 ARP, Request who-has 10.10.102.218 tell 10.10.1.69, length 46
15:19:53.031165 ARP, Request who-has 10.10.103.218 tell 10.10.1.69, length 46
15:19:53.031167 ARP, Request who-has 10.10.104.218 tell 10.10.1.69, length 46
15:19:53.032360 IP dns.google.domain > lenovo-001.49948: 60125 NXDomain 0/0/0 (44)
15:19:53.032850 IP lenovo-001.40199 > dns.google.domain: 37223+ [1au] PTR? 217.106.10.10.in-addr.arpa. (55)
15:19:53.051349 IP dns.google.domain > lenovo-001.40199: 37223 NXDomain 0/0/1 (55)
15:19:53.051499 IP lenovo-001.40199 > dns.google.domain: 37223+ PTR? 217.106.10.10.in-addr.arpa. (44)
15:19:53.068927 IP dns.google.domain > lenovo-001.40199: 37223 NXDomain 0/0/0 (44)
15:19:53.069599 IP lenovo-001.53714 > dns.google.domain: 22296+ [1au] PTR? 217.111.10.10.in-addr.arpa. (55)
15:19:53.087396 IP dns.google.domain > lenovo-001.53714: 22296 NXDomain 0/0/1 (55)
15:19:53.087449 IP lenovo-001.53714 > dns.google.domain: 22296+ PTR? 217.111.10.10.in-addr.arpa. (44)
15:19:53.104190 IP dns.google.domain > lenovo-001.53714: 22296 NXDomain 0/0/0 (44)
15:19:53.104655 IP lenovo-001.43518 > dns.google.domain: 49835+ [1au] PTR? 218.96.10.10.in-addr.arpa. (54)
15:19:53.121380 IP dns.google.domain > lenovo-001.43518: 49835 NXDomain 0/0/1 (54)
15:19:53.121502 IP lenovo-001.43518 > dns.google.domain: 49835+ PTR? 218.96.10.10.in-addr.arpa. (43)
15:19:53.137326 IP dns.google.domain > lenovo-001.43518: 49835 NXDomain 0/0/0 (43)
15:19:53.137638 IP lenovo-001.40867 > dns.google.domain: 38219+ [1au] PTR? 218.97.10.10.in-addr.arpa. (54)
15:19:53.157594 IP dns.google.domain > lenovo-001.40867: 38219 NXDomain 0/0/1 (54)
15:19:53.157706 IP lenovo-001.40867 > dns.google.domain: 38219+ PTR? 218.97.10.10.in-addr.arpa. (43)
15:19:53.176488 IP dns.google.domain > lenovo-001.40867: 38219 NXDomain 0/0/0 (43)
15:19:53.176989 IP lenovo-001.52182 > dns.google.domain: 37924+ [1au] PTR? 218.98.10.10.in-addr.arpa. (54)
15:19:53.196749 IP dns.google.domain > lenovo-001.52182: 37924 NXDomain 0/0/1 (54)
15:19:53.196948 IP lenovo-001.52182 > dns.google.domain: 37924+ PTR? 218.98.10.10.in-addr.arpa. (43)
15:19:53.216274 IP dns.google.domain > lenovo-001.52182: 37924 NXDomain 0/0/0 (43)
15:19:53.216793 IP lenovo-001.53738 > dns.google.domain: 51249+ [1au] PTR? 218.99.10.10.in-addr.arpa. (54)
15:19:53.231726 ARP, Request who-has 10.10.109.218 tell 10.10.1.69, length 46
15:19:53.231741 ARP, Request who-has 10.10.110.218 tell 10.10.1.69, length 46
15:19:53.231743 ARP, Request who-has 10.10.111.218 tell 10.10.1.69, length 46
15:19:53.231745 ARP, Request who-has 10.10.96.219 tell 10.10.1.69, length 46
15:19:53.231747 ARP, Request who-has 10.10.97.219 tell 10.10.1.69, length 46
15:19:53.231748 ARP, Request who-has 10.10.98.219 tell 10.10.1.69, length 46
15:19:53.231750 ARP, Request who-has 10.10.99.219 tell 10.10.1.69, length 46
15:19:53.231752 ARP, Request who-has 10.10.100.219 tell 10.10.1.69, length 46
15:19:53.231769 ARP, Request who-has 10.10.101.219 tell 10.10.1.69, length 46
15:19:53.231771 ARP, Request who-has 10.10.102.219 tell 10.10.1.69, length 46
15:19:53.238964 IP dns.google.domain > lenovo-001.53738: 51249 NXDomain 0/0/1 (54)
15:19:53.239123 IP lenovo-001.53738 > dns.google.domain: 51249+ PTR? 218.99.10.10.in-addr.arpa. (43)
15:19:53.256326 IP dns.google.domain > lenovo-001.53738: 51249 NXDomain 0/0/0 (43)
15:19:53.256867 IP lenovo-001.53622 > dns.google.domain: 41436+ [1au] PTR? 218.100.10.10.in-addr.arpa. (55)
15:19:53.265375 ARP, Request who-has 10.10.1.5 tell _gateway, length 46
15:19:53.276032 IP dns.google.domain > lenovo-001.53622: 41436 NXDomain 0/0/1 (55)
15:19:53.276242 IP lenovo-001.53622 > dns.google.domain: 41436+ PTR? 218.100.10.10.in-addr.arpa. (44)
15:19:53.295124 IP dns.google.domain > lenovo-001.53622: 41436 NXDomain 0/0/0 (44)
15:19:53.295712 IP lenovo-001.43498 > dns.google.domain: 4803+ [1au] PTR? 218.101.10.10.in-addr.arpa. (55)
15:19:53.314798 IP dns.google.domain > lenovo-001.43498: 4803 NXDomain 0/0/1 (55)
15:19:53.314953 IP lenovo-001.43498 > dns.google.domain: 4803+ PTR? 218.101.10.10.in-addr.arpa. (44)
15:19:53.333376 IP dns.google.domain > lenovo-001.43498: 4803 NXDomain 0/0/0 (44)
15:19:53.333897 IP lenovo-001.53175 > dns.google.domain: 6873+ [1au] PTR? 218.102.10.10.in-addr.arpa. (55)
15:19:53.350346 IP dns.google.domain > lenovo-001.53175: 6873 NXDomain 0/0/1 (55)
15:19:53.350568 IP lenovo-001.53175 > dns.google.domain: 6873+ PTR? 218.102.10.10.in-addr.arpa. (44)
15:19:53.366166 IP dns.google.domain > lenovo-001.53175: 6873 NXDomain 0/0/0 (44)
15:19:53.366757 IP lenovo-001.57088 > dns.google.domain: 56903+ [1au] PTR? 218.103.10.10.in-addr.arpa. (55)
15:19:53.384041 IP dns.google.domain > lenovo-001.57088: 56903 NXDomain 0/0/1 (55)
15:19:53.384241 IP lenovo-001.57088 > dns.google.domain: 56903+ PTR? 218.103.10.10.in-addr.arpa. (44)
15:19:53.400716 IP dns.google.domain > lenovo-001.57088: 56903 NXDomain 0/0/0 (44)
15:19:53.401262 IP lenovo-001.46997 > dns.google.domain: 25348+ [1au] PTR? 218.104.10.10.in-addr.arpa. (55)
15:19:53.423592 IP dns.google.domain > lenovo-001.46997: 25348 NXDomain 0/0/1 (55)
15:19:53.423749 IP lenovo-001.46997 > dns.google.domain: 25348+ PTR? 218.104.10.10.in-addr.arpa. (44)
15:19:53.432479 ARP, Request who-has 10.10.109.218 tell 10.10.1.69, length 46
15:19:53.432494 ARP, Request who-has 10.10.110.218 tell 10.10.1.69, length 46
15:19:53.432496 ARP, Request who-has 10.10.111.218 tell 10.10.1.69, length 46
15:19:53.432498 ARP, Request who-has 10.10.96.219 tell 10.10.1.69, length 46
15:19:53.432500 ARP, Request who-has 10.10.97.219 tell 10.10.1.69, length 46
15:19:53.432502 ARP, Request who-has 10.10.98.219 tell 10.10.1.69, length 46
15:19:53.432503 ARP, Request who-has 10.10.99.219 tell 10.10.1.69, length 46
15:19:53.432505 ARP, Request who-has 10.10.100.219 tell 10.10.1.69, length 46
15:19:53.432526 ARP, Request who-has 10.10.101.219 tell 10.10.1.69, length 46
15:19:53.432529 ARP, Request who-has 10.10.102.219 tell 10.10.1.69, length 46
15:19:53.439800 IP dns.google.domain > lenovo-001.46997: 25348 NXDomain 0/0/0 (44)
15:19:53.440518 IP lenovo-001.56059 > dns.google.domain: 32666+ [1au] PTR? 218.109.10.10.in-addr.arpa. (55)
15:19:53.459309 IP dns.google.domain > lenovo-001.56059: 32666 NXDomain 0/0/1 (55)
15:19:53.459473 IP lenovo-001.56059 > dns.google.domain: 32666+ PTR? 218.109.10.10.in-addr.arpa. (44)
15:19:53.477672 IP dns.google.domain > lenovo-001.56059: 32666 NXDomain 0/0/0 (44)
15:19:53.478180 IP lenovo-001.39667 > dns.google.domain: 58458+ [1au] PTR? 218.110.10.10.in-addr.arpa. (55)
15:19:53.495015 IP dns.google.domain > lenovo-001.39667: 58458 NXDomain 0/0/1 (55)
15:19:53.495211 IP lenovo-001.39667 > dns.google.domain: 58458+ PTR? 218.110.10.10.in-addr.arpa. (44)
15:19:53.511198 IP dns.google.domain > lenovo-001.39667: 58458 NXDomain 0/0/0 (44)
15:19:53.511731 IP lenovo-001.46719 > dns.google.domain: 30063+ [1au] PTR? 218.111.10.10.in-addr.arpa. (55)
15:19:53.533048 IP dns.google.domain > lenovo-001.46719: 30063 NXDomain 0/0/1 (55)
15:19:53.533269 IP lenovo-001.46719 > dns.google.domain: 30063+ PTR? 218.111.10.10.in-addr.arpa. (44)
15:19:53.552640 IP dns.google.domain > lenovo-001.46719: 30063 NXDomain 0/0/0 (44)
15:19:53.553172 IP lenovo-001.49570 > dns.google.domain: 31969+ [1au] PTR? 219.96.10.10.in-addr.arpa. (54)
15:19:53.572964 IP dns.google.domain > lenovo-001.49570: 31969 NXDomain 0/0/1 (54)
15:19:53.573049 IP lenovo-001.49570 > dns.google.domain: 31969+ PTR? 219.96.10.10.in-addr.arpa. (43)
15:19:53.590458 IP dns.google.domain > lenovo-001.49570: 31969 NXDomain 0/0/0 (43)
15:19:53.590758 IP lenovo-001.57199 > dns.google.domain: 24996+ [1au] PTR? 219.97.10.10.in-addr.arpa. (54)
15:19:53.611000 IP dns.google.domain > lenovo-001.57199: 24996 NXDomain 0/0/1 (54)
15:19:53.611077 IP lenovo-001.57199 > dns.google.domain: 24996+ PTR? 219.97.10.10.in-addr.arpa. (43)
15:19:53.630273 IP dns.google.domain > lenovo-001.57199: 24996 NXDomain 0/0/0 (43)
15:19:53.630553 IP lenovo-001.36104 > dns.google.domain: 29667+ [1au] PTR? 219.98.10.10.in-addr.arpa. (54)
15:19:53.632909 ARP, Request who-has 10.10.107.219 tell 10.10.1.69, length 46
15:19:53.632920 ARP, Request who-has 10.10.108.219 tell 10.10.1.69, length 46
^C15:19:53.632922 ARP, Request who-has 10.10.109.219 tell 10.10.1.69, length 46

1073 packets captured
1158 packets received by filter
37 packets dropped by kernel
mtech@lenovo-001:~$ 

