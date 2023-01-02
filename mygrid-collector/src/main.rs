use std::ops::Range;
use rand::prelude::*;

fn main() {
    let rf = random_float(0..10);
    println!("Hello, world, {}", rf);
}

fn random_float(r : Range<i32>) -> i32 {
    let mut rng = rand::thread_rng();
    rng.gen_range(r)
}