#!/usr/bin/env python3

import subprocess, csv


# run() returns a CompletedProcess object if it was successful
# errors in the created process are raised here too

all_searches = []


def search(stage, day, time, throw):
    
    process = subprocess.run(['java', '-cp', 'bin', 'LSBSTApp', stage, day, time, throw], check=True, stdout=subprocess.PIPE, universal_newlines=True, cwd=r'/home/mark/javaWork/ass_1')
    print(process.stdout)
    output = process.stdout.split()
    return output[-1]
    

for i in range(1,11):
    outArray = []
    throw = "subset" + str(i) + ".txt"

    textFile = open(throw, 'r')
    lines = textFile.readlines()
    for line in lines:
        use = line.split(sep='_')
        outArray.append(search(stage=use[0], day=use[1], time=use[2][:2], throw=throw))
    all_searches.append(outArray)

with open('all_insertions.csv', 'x') as myFile:
    writ = csv.writer(myFile, dialect='excel')
    writ.writerows(all_searches)


    