An anagram is a word that can be written as a permutation of the characters of another word, 
like "dirty room" and "domitory"(ignore spaces). However, "the" and "thee" are not anagrams, 
since "the" only has a single "e" whereas "thee" has two "e" characters
(spaces can occur zero, or multiple times, however).

Give a list of words as input, you should output another list of strings, 
each containing words that are mutual anagrams.

Each string of the output should be a single group of anagrams joined with commas.

Within an output string, the expressions should be sorted lexicographically. 
If a group contains only a single element, output that one-element group as a single string. 
And the strings should also be output in lexicographical order. Given e.g.:

pear
amleth
dormitory
tinsel
dirty room
hamlet
listen
silent

the output would be:
amleth,hamlet
dirty room,dormitory
listen,silent,tinsel
pear