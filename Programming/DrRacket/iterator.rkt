#lang racket

(define (createList size)
  (if (<= size 0)
      (list)
      (append (list (random 20)) (createList (- size 1)))
  )
)

(define mainList (createList 15))

(define (iterator inList)
  (if (< (length inList) 2)
      inList
      (cons (car inList) (cons (+ (car(cdr inList)) 20) (iterator (cdr(cdr inList)))))
  )
)