#lang racket
(define fibonacci
 (lambda (n)
   (if (or (= n 0) (= n 1))
       1
       (+ (fibonacci (- n 1)) (fibonacci (- n 2))))))