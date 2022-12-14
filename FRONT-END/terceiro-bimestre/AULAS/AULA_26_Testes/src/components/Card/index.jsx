const Card = (props) => {
  const { title, description } = props;

  return (
    <div>
      <h1>{title}</h1>
      <p>{description}</p>
    </div>
  );
};

export default Card;
