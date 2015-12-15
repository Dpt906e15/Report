#lang racket
(define fibonacci
 (lambda (n)
   (if (= n 0) 1
        (if (= n 1) 1
            (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))))