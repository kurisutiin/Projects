import sys

def main():
    readfile()

def readfile():
    file = sys.argv[1] #get the file from the argument
    f=open(file,"r") #opens the file essay.txt
    report=f.read()
    checkfile(report)
    f.close()
def checkfile(report):
    a=0
    endofsentence=0
    count = len(report)
    for a in range(0, count):
        if report[a] =='.'or report[a] == ','or report[a] == '!'or report[a] == ';':
            endofsentence += 1

    words = report.split()
    print(words)

    validwords = 0
    testword = 0
    b=0
    for a in words:
        testword = words[b]
        testword = len(testword)
        if testword >= 3:
           validwords += 1
        b += 1


    numberwords=len(words)
    print("The number of words is", len(words), "The total number of valid words is", validwords)
    print("The average number of words per sentence is", validwords/endofsentence)


main()

