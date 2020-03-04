#!/usr/bin/env python3

import subprocess, csv


# run() returns a CompletedProcess object if it was successful
# errors in the created process are raised here too

insertion_counts = []




for i in range(1,11):
    throw = "subset" + str(i) + ".txt"
    process = subprocess.run(['java', '-cp', 'bin', 'LSBSTApp', '1', '28', '16', throw], check=True, stdout=subprocess.PIPE, universal_newlines=True, cwd=r'/home/mark/javaWork/ass_1')
    output = process.stdout.split()
    insertion_counts.append(output[0])

with open('insertion_counts.csv', 'x') as myFile:
    writ = csv.writer(myFile, dialect='excel')
    writ.writerow(insertion_counts)

def 