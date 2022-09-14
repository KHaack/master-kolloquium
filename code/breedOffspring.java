Set<Individual> breedOffspring(Set<Individual> population) {
	int populationSize = 50
	double crossoverRate = 0.75;
	double testInsert = 0.1;
	
	Set<Individual> offspring = new Set<Individual>();
	
	for (int i = 0; i < populationSize / 2; i++) {
		// select two individuals per iteration
		Individual individual1 = selectionFunction(population);
		Individual individual2 = selectionFunction(population);
		
		// crossover
		if(Randomness.nextDouble() <= crossoverRate) {
			crossover(individual1, individual2);
		}
		
		// mutate
		mutate(individual1);
		mutate(individual2);
		
		offspring.add(individual1);
		offspring.add(individual2);
	}
	
	for(int i = 0; i < populationSize * testInsert; i++) {
		if(Randomness.nextBoolean()) {
			// generate new
			offspring.add(generateNew());
		} else {
			// mutate old from archive
			Individual choice = Randomness.choice(getArchive());
			mutate(choice);
			
			offspring.add(choice);
		}
	}
	
	return offspring;
}